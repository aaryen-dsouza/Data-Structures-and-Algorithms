// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(binarySearch(arr));
    }

    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }
}
