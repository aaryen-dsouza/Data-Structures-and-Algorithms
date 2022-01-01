import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3 ,2, 1};
        fun(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(int[] arr, int last) {
        if(last == 0) {
            return;
        }
        int max = maxFinder(arr, last);
        swap(arr, max, last);
        fun(arr, last - 1);
    }

    static int maxFinder(int[] arr, int length) {
        int max = 0;
        for (int i = 1; i <= length; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
