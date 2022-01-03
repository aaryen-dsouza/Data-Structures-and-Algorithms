public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(fun( "baccad"));

    }

    static void fun(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        if(ch == 'a') {
            fun(processed, unProcessed.substring(1));
        } else {
            fun(processed + ch, unProcessed.substring(1));
        }
    }

    static String fun(String unProcessed) {
        if(unProcessed.isEmpty()) {
            return "";
        }

        char ch = unProcessed.charAt(0);

        if(ch == 'a') {
            return fun(unProcessed.substring(1));
        } else {
            return ch + fun(unProcessed.substring(1));
        }
    }
}
