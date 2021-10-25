public class CipherCode {
    public static void main(String[] args) {
        String s = "Where are you? Meet me near the clock tower";
        System.out.println(convert(s));
    }

    static String convert (String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count ++;
                if (count > 2){
                    sb.append(' ');
                    count = 0;
                }
            } else {
                if (count == 0) {
                    if (s.charAt(i) == 'a' ||  s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                        sb.append('%');
                    } else {
                        sb.append(s.charAt(i));
                    }
                } else if (count == 1) {
                    if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' || Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o' || Character.toLowerCase(s.charAt(i)) == 'u') {
                        sb.append(s.charAt(i));
                    } else {
                        sb.append('#');
                    }
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
