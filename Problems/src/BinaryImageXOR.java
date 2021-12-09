import java.util.Arrays;

public class BinaryImageXOR {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0 , 1}, {0, 1, 1}};
        System.out.println(Arrays.deepToString(reverse(arr)));
    }
    static int[][] reverse(int[][] arr) {
        for(int[] row: arr) {
            for(int i = 0; i < (arr[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length - i - 1] ^ 1;
                row[arr[0].length - i - 1] = temp;
            }
        }
        return arr;
    }
}
