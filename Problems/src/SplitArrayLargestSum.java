// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // binary search
        while(start < end){
            // try for middle as potential answer
            int mid = start + (end - start) / 2;
//            System.out.println(mid);

            // calculate number of pieces you can divide in with max sum i.e mid
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if (sum + num > mid){
//                    System.out.println(mid);
                    // u can't add to the sub array, make new one
                    // u add this num in new sub array, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start = end
    }
}
