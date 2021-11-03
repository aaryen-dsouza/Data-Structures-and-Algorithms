// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;

public class GreatestNumOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int[] copy = candies.clone();
        int extraCandies = 3;
        ArrayList<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            copy[i] += extraCandies;
            result.add(isMax(candies, copy, i));
        }
        System.out.println(result);
    }

    static boolean isMax(int[] arr, int[] cp, int pivot){
        boolean intim = false;
        for(int i = 0; i < arr.length; i++){
            if (cp[pivot] >= arr[i]){
                intim = true;
            } else {
                return false;
            }
        }
        return intim;
    }
}
