public class SearchInDuplicateRSA {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = pivotCases(arr);
        if (pivot == -1){
            System.out.println(binarySearch(arr, target, 0, arr.length -1));
        }
        if (arr[pivot] == target){
            System.out.println(pivot);
        }
        if (arr[0] <= target){
            System.out.println(binarySearch(arr, target, 0, pivot - 1));
        } else {
            System.out.println(binarySearch(arr, target, pivot + 1, arr.length - 1));
        }
    }

    static int pivotCases(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[start] >= arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            // conditions if there are duplicates in the array
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;

                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end --;
            }

            // left side is sorted then pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
