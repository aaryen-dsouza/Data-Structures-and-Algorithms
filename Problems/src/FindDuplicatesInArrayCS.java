// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;

public class FindDuplicatesInArrayCS {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int i = 0;
        while (i < nums.length){
            int current = nums[i] - 1;
            if (nums[i] != nums[current]){
                swap(nums, i, current);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                ans.add(nums[i]);
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
