public class Pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {


        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
