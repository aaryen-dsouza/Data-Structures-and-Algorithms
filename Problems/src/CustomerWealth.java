// https://leetcode.com/problems/richest-customer-wealth/

public class CustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
