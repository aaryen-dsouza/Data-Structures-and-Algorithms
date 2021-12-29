public class SortCheck {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(fun(arr, 0));
    }

    static boolean fun(int[] arr, int i) {
        if(arr.length - 1 == i) {
            return true;
        }
        return arr[i] < arr[i + 1] && fun(arr, i + 1);
    }
}
