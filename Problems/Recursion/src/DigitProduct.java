public class DigitProduct {
    public static void main(String[] args) {
        int ans = fun(543);
        System.out.println(ans);
    }

    static int fun(int n) {
        if(n % 10 == n) {
            return n;
        }
        return (n % 10) * fun(n / 10);
    }
}
