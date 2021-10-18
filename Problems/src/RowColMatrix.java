import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 15, 25},
                {8, 18, 28},
                {10, 20, 30}
        };
        int target = 20;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int column = arr.length - 1;

        while (row < arr.length && column >= 0){
            if(arr[row][column] == target){
                return new int[]{row, column};
            }
            if(arr[row][column] < target){
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }
}
