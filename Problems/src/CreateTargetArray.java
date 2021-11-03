// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            for(int j = nums.length-1; j > index[i]; j--){
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(target));
    }
}
