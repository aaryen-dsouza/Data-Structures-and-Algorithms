// https://leetcode.com/problems/set-mismatch/

public class FindErrorNums {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int i = 0;
        while(i < nums.length){
            int current = nums[i] - 1;
            if(nums[current] != nums[i]){
                swap(nums, i, current);
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                System.out.println(nums[i] + " , " + (i + 1));
            }
        }
    }

    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
