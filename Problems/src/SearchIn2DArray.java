import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 5, 6},
                {2, 9, 14, 67, 54},
                {100, 56, 45, 22}
        };
        int target = 45;
        int[] ans = search(arr, target); // format of return value {row, column}
        System.out.println(Arrays.toString(ans));
        int max = maximum(arr);
        System.out.println(max);
    }

    // find max in 2d array
    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }

    // asuming arr[] != 0
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
