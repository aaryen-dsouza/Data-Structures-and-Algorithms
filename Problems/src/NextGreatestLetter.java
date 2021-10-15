// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// similar to ceiling of a number

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGL(letters, target));

        /*
        *****MORE FASTER SOLUTION*****
            for(char c : letters) {
            if (c > target) {
                System.out.println(c);
            }
        }
        System.out.println(letters[0]);
         */

    }

    static char nextGL(char[] letters, char target) {

        /*
        *****MORE FASTER SOLUTION*****
            for(char c : letters) {
            if (c > target) {
                return c;
            }
            return letters[0];
        }
         */

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

           if (target < letters[mid]){
               end = mid -1;
           } else {
               start = mid + 1;
           }
        }
        return letters[start % letters.length];  // if start crosses the length of array i.e 4 % 4 = 0
    }
}
