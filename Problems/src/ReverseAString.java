public class ReverseAString {
    public static void main(String[] args) {
        String text = "hello i am aaryen";
        reverseAString(text);
    }

    static void reverseAString(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        System.out.println(sb);
    }
}
