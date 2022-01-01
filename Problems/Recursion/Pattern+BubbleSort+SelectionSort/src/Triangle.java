public class Triangle {
    public static void main(String[] args) {
        fun1(4, 0);
    }

    static void fun(int row, int col) {
        if (row == 0) {
            return;
        }
        if(col < row) {
            System.out.print("*");
            fun(row, col + 1);
        }
        if(col == row) {
            System.out.println();
            fun(row - 1, 0);
        }
    }

    static void fun1(int row, int col) {
        if(row == 0) {
            return;
        }
        if(col < row) {
            fun1(row, col + 1);
            System.out.print("*");
        } else {
            fun1(row - 1, 0);
            System.out.println();
        }
    }
}
