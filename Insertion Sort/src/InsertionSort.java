import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2 , 1};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int second, int first) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
