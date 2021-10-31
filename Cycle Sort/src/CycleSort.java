import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        cyclicSort(arr);
    }

    /* helpful when 1 to n is linear,
   places the element wrt to its index position */
    
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
