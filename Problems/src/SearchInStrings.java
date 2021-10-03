public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Aaryen";
        char target = 'y';
        System.out.println(search(str, target));
        System.out.println(search2(str, target));
    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // using for each loop
        for (char ch: str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target) {
        if(str.length() == 0){
            return false;
        }

        // using for loop
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
