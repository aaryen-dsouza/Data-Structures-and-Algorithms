public class Pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            int col;
            for (col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    // My solution
//    static void pattern(int n) {
//        for (int row = 1; row <= n ; row++) {
//            int spaces = n - row, count = row;
//            for (int col = 1; col < n * 2; col++) {
//                if (col <= n) {
//                    if (spaces >= col) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print(count);
//                    count--;
//                    }
//                } else {
//                    if (count == 0) {
//                        count = 2;
//                    }
//                    int stroke = row - 1;
//                    if (spaces >= (n * 2) - col) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print(count);
//                        count++;
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
}
