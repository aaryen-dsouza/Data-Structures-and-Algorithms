import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 9;
        System.out.println(Arrays.toString(search(arr, target)));
    }
// binary search for a specified row and ranged column
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(target > arr[row][mid]){
                cStart = mid + 1;
           } else if (target < arr[row][mid]){
                cEnd = mid - 1;
            } else {
                return new int[]{row, mid};
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int columns = arr[0].length;

        if (rows == 1){
            return binarySearch(arr, 0, 0, columns - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = columns / 2;

        while (rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }

        // now we have 2 rows
        // check whether target is in the cMid mid range
        if (arr[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        // search in bounds
//        search in 1st half
        if (target <= arr[rStart][cMid - 1]){
        return binarySearch(arr, rStart, 0, cMid - 1, target);
        }

//        search in 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][columns -1]) {
            return binarySearch(arr, rStart, cMid + 1, columns - 1, target);
        }

//        search in 3rd half
        if (target <= arr[rStart + 1][cMid - 1]){
            return binarySearch(arr, rStart + 1, 0, cMid - 1, target);
        }

//        search in 4th half
        if (target >= arr[rStart + 1][cMid + 1]){
            return binarySearch(arr, rStart + 1, cMid + 1, columns - 1, target);
        }

        return new int[]{-1, -1};
    }
}

