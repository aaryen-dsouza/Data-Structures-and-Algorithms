import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // inclusive: including the last number
    // exclusive: excluding the last number

    static int[] mergeSort(int[] arr) {
        // if arr has only one element
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        // create left and right side of the array
        //copy of range is exclusive method
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // for sorting the elem
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second. length];

        // i pointer for first, j for second and k for mix array
        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete
        // then copy the remaining elements

        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


}
