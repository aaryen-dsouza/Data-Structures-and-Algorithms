public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-19, -8, -2, 1, 4, 5, 7, 9, 10, 17, 21, 28};
        int target = 40;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
