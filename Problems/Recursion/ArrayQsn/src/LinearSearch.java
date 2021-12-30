import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6};
//        int[] arrIndexes = {-1};
        System.out.println(fun(arr, 0, 2));
        System.out.println(findIndex(arr, 0, 2));
        System.out.println(findLastIndex(arr, arr.length -1, 2));
        findInstances(arr, 0, 2);
        System.out.println(list.toString());
    }

    static boolean fun(int[] arr, int i, int n) {
        if(i == arr.length) {
            return false;
        }
        return arr[i] == n || fun(arr, i + 1, n);
    }

    static int findIndex(int[] arr, int i, int n) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == n) {
            return i;
        } else {
            return findIndex(arr, i + 1, n);
        }
    }

    static int findLastIndex(int[] arr, int i, int n) {
        if(i == -1) {
            return -1;
        }
        if(arr[i] == n) {
            return i;
        } else {
            return findIndex(arr, i - 1, n);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findInstances(int[] arr, int i, int n) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == n) {
            list.add(i);
        }
        findInstances(arr, i + 1, n);
    }
}
