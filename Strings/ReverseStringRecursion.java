package Strings;

public class ReverseStringRecursion {
    

    public static String reverse(String s) {
        
        if (s.length() <= 1) {
            return s;
        }

        // 🔁 Recursive Call
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";

        String result = reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }
}
    

