public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        int spaces;
        for (int row = 1; row < n * 2; row++) {
            int count = 1;
            if (row <= n){
                spaces = n - row;
            } else {
                spaces = row - n;
            }

            if (row <= n){
                for (int col = 1; col <= n ; col++) {
                    if (col <= spaces) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            } else {
                for (int col = (n * 2) ; col > n; col--){
                    if (count <= spaces){
                        System.out.print(" ");
                        count++;
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
