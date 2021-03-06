public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("bacapplecdah"));
    }

    static String skipString(String unProcessed) {
        if(unProcessed.isEmpty()) {
            return "";
        }

        if (unProcessed.startsWith("apple")) {
            return skipString(unProcessed.substring(5));
        } else {
            return unProcessed.charAt(0) + skipString(unProcessed.substring(1));
        }
    }

    static String appNotApple(String unProcessed) {
        if(unProcessed.isEmpty()) {
            return "";
        }
        if (unProcessed.startsWith("app") && !unProcessed.startsWith("apple")) {
            return skipString(unProcessed.substring((3)));
        } else {
            return unProcessed.charAt(0) + skipString(unProcessed.substring(1));
        }
    }
}
