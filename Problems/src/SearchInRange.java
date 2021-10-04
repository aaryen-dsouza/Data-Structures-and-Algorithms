import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Start index? ");
        int start = s.nextInt();
        System.out.println("end index? ");
        int end = s.nextInt();
        int[] nums = {23, 45, 1, 2, 3, 4, 78, 19, 82};
        int target = 3;
        int ans = linearSearch(nums, target, start, end);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        else if (end > arr.length){
            return -1;
        }

        // searching algo
        for (int i = start; i < end; i++) {
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
