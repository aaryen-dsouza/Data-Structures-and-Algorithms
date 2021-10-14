public class BinarySearchAlgorithm {
    public static void main(String[] args) {
    int[] arr = {-19, -8, -2, 1, 4, 5, 7, 9, 10, 17, 21, 28};
    int target = 40;
    int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //returns index
    //returns -1 if not found
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
//            int mid = (start + end) / 2;
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
