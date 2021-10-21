// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositiveCS {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int i = 0;
        while(i < nums.length){
            if (nums[i] <= 0 || nums[i] > nums.length) {
                i++;
                continue;
            }
            int current = nums[i] - 1;
            if(nums[current] != nums[i]){
                swap(nums, i, current);
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                System.out.println(i + 1);
            }
        }
//        System.out.println(nums.length + 1);
    }
    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
