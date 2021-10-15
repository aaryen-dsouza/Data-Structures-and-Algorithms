// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class SearchFIrstLastOccurence {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;

        int[] arr = {-1, -1};
        arr[0] = search(nums, target, true);
        if (arr[0] != -1){
            arr[1] = search(nums, target, false);
        }
        System.out.println(arr[0] + " , " + arr[1]);
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid -1;
            } else {
                ans = mid;
                if(findFirstIndex){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
