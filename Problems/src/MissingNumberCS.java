// https://leetcode.com/problems/missing-number/

public class MissingNumberCS {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        missingNumber(nums);
    }

    static void missingNumber(int[] nums){
        int n = nums.length, i = 0;
        while( i < n){
            int correct = nums[i];
            if (nums[i] == n){
                i++;
                continue;
            }
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(indexChecker(nums));
    }

    static int indexChecker(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
