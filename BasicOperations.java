public class BasicOperations {
    public static void main(String[] args) {
        String s = "Hello, World!";

        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(0, 5));
        System.out.println("Replace: " + s.replace("World", "Java"));
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("Trim: " + "  hello  ".trim());
    }
    
}
