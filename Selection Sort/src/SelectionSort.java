import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
    }

    static void selectionSort(int[] arr){
        int end = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++){
            int max = maxSearch(arr, end);
            // swap the largest to req position
            if (max != end){
                int temp = arr[max];
                arr[max] = arr[end];
                arr[end] = temp;
            }
            end--;
            if (end == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static int maxSearch(int[] arr, int end){
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        // will return the index of max element
        return max;
    }
}
