// ceiling of a number use binary search
// greatest or = number than target
//Whenever the array is sorted use binary search
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {-19, -8, -2, 1, 4, 5, 7, 9, 10, 17, 21, 28};
        int target = 14;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }
}
