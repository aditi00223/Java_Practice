public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbbccddddee";
        String result = "";
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += s.charAt(i - 1) + "" + count;
                count = 1;
            }
        }
        result += s.charAt(s.length() - 1) + "" + count;

        System.out.println("Original: " + s);
        System.out.println("Compressed: " + result);
    }
}