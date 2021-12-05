public class StudentsSeatingSorting {
    public static void main(String[] args) {
        int[] seats = {12, 14, 19, 19, 12};
        int[] students = {19, 2, 17, 20, 7};
        insertionSort(seats);
        insertionSort(students);
        int diff = 0;
        for (int i = 0; i < seats.length; i++) {
            diff += (seats[i] - students[i]);
        }
        System.out.println(Math.abs(diff));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int second, int first) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
