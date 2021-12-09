// Count the number of set bits in a given binary number

public class SetBitsCount {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;
//        Normal method
//        while(n > 0) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n = n >> 1;
//        }
        while(n > 0) {
            count++;
            n -= (n & -n);
        }
        System.out.println(count);
    }
}
