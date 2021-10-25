public class Pattern2 {
    public static void main(String[] args) {
        pattern(4);
    }
    
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            // after one row, new line
            System.out.println();
        }
    }
}
