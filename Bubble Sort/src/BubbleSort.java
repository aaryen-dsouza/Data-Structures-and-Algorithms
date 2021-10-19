import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);

    }

    static void bubbleSort(int[] arr){
        int swap = 0;
        // run steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will be at last
            for (int j = 1; j < arr.length - i; j++) {
                // swap if j < j - i
                if (arr[j] < arr[j - 1]){
                    swap = 1;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if (swap == 0){
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
