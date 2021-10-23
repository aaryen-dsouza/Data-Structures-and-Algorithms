// Write a function to find if a number is a palindrome or not. Take number as parameter.

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 1234321;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num){
        int temp = num, sum = 1, c = 0;
        while (temp > 0){
            int n = temp % 10;
            if (c == 1)
            {
                sum = sum * 10 + n;
            } else {
                sum = n;
                c = 1;
            }
            temp = temp / 10;
        }
        return sum == num;
    }
}
