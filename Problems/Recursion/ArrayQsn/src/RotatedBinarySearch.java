public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(fun(arr, 2, 0, arr.length - 1));
    }

    static int fun(int[] arr,int target,int start,int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return fun(arr, target, start, mid - 1);
            } else {
                return fun(arr, target, mid + 1, end);
            }
        } else {
            if(target >= arr[mid] && target <= arr[end]) {
                return fun(arr, target, mid + 1, end);
            } else {
                return fun(arr, target, start, mid - 1);
            }
        }
    }
}
