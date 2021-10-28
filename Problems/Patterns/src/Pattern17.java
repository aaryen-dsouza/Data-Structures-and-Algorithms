public class Pattern17 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int c = row > n ? (n * 2) - row : row;
            for (int spaces = 0; spaces <= n - c; spaces++) {
                System.out.print(" ");
            }
            int col;
            for (col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for (col = 2; col <= c; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
