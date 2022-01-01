import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        fun(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(int[] arr, int i, int end) {
        if(end == 0) {
            return;
        }
        if(i < end) {
            if(arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
            fun(arr, i+1, end);
        }
        else{
            fun(arr, 0, end - 1);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
