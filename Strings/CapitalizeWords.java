package Strings;
public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "hello world from java";
        String result = capitalizeWords(str);
        System.out.println(result);
    }

    public static String capitalizeWords(String str) {
        StringBuilder result = new StringBuilder();

        // Flag to check if next character should be capitalized
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result.append(ch);
                capitalizeNext = true; // next char is start of a word
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}