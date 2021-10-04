public class MinimumNumber {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 3, 4, 78, 19, 82};
        int min = minimumNumber(nums);
        System.out.println(min);
    }

    static int minimumNumber(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
