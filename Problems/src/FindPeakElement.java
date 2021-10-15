// https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(binarySearch(nums));
    }

    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int ans = -1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
