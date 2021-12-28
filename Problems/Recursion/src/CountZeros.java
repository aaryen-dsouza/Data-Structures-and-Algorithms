public class CountZeros {
    public static void main(String[] args) {
        int count = fun(3040, 0);
        System.out.println(count);
//        System.out.println(4 / 10);
    }

    static int fun(int n, int count) {
        if(n == 0) {
            return count;
        }
        if(n % 10 == 0) {
            return fun(n / 10, count + 1);
        }
            return fun(n / 10, count);
    }
}
