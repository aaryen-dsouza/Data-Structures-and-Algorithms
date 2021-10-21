// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
// Google Question

import java.util.ArrayList;
import java.util.List;

public class FindDisappearingNumbersCS {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int i = 0;
        while (i < nums.length) {
            int current = nums[i] - 1;
            if (nums[current] != nums[i]){
                swap(nums, current, i);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i = 0; i < nums.length; i++){
            if (nums[i] != i + 1){
                ans.add(i + 1);
            }
        }
        System.out.println(ans);
    }
    static void swap (int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
