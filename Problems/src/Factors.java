import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factor2(20);
        factor3(20);
    }

    // O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factor2(int n) {
        System.out.println();
        for(int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    // now time and space will be O(sqrt(n))
    //cos we are storing the values the space complexity is not constant
    static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println();
        for(int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
