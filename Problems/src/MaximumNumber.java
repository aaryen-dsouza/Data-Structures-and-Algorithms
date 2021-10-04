public class MaximumNumber {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 3, 4, 78, 19, 82};
        int max = minimumNumber(nums);
        System.out.println(max);
    }

    static int minimumNumber(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
