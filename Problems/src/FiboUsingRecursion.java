public class FiboUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    // for recursion try to break the solution in small parts
    static int fibo(int n) {

        // base condition
        if (n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
