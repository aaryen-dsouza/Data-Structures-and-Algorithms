// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(countNumbers(nums));
    }

    static int countNumbers(int[] nums){
        int count = 0;
        for(int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = checkDigit(num);
        /*
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;
    }

    static int checkDigit(int num) {
        int no = 0;
        while (num <= 0){
            no++;
            num /= 10;
        }
        return no;
    }
}
