public class ReverseANum {
    public static void main(String[] args) {
//        fun(4321);
        System.out.println(fun2(4321));
//        System.out.println((int)(Math.log10(4321)));
    }

    static int sum = 0;

    static void fun(int n) {
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        fun(n / 10);
    }

    static int fun2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
}
