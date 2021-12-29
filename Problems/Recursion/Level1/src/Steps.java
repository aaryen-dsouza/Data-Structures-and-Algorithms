public class Steps {
    public static void main(String[] args) {
        System.out.println(fun(8, 0));
    }

    static int fun(int n, int count) {
        if(n == 0) {
            return count;
        }
        if(n % 2 == 0){
            return fun(n / 2, count + 1);
        }
        return fun(n - 1, count + 1);
    }
}
