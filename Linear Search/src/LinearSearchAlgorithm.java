import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 3, 4, 78, 19, 82};
        int target = 29;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return index if item is found
    // otherwise if the item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // searching algo
        for (int i = 0; i < arr.length; i++) {
         // check for element at every index
         if (arr[i] == target){
             return i;
         }
        }
        // this line will be executed of none of the return statements are executed
        // Target not found
        return -1;
    }
}
