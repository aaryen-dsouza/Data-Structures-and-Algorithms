public class pattern5 {
    public static void main(String[] args) {
        pattern(7);
    }

    static void pattern(int n){
        for (int row = 1; row < n * 2 ; row++) {
            if (row <= n){
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (row > 5) {
                for (int col = (n * 2) - row; col >= 1; col--) {
                    System.out.print("* ");
                }
                System.out.println();
            }


        }
    }
}
