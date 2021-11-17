public class FindUniqueUseEXOR {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 4, 3, 6};
        System.out.println(uni(arr));
    }

    static int uni(int[] arr){
        int unique = 0;
        for(int n: arr) {
            unique ^= n;
        }
        return unique;
    }
}
