public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Hello World Java";
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            result += new StringBuilder(word).reverse().toString() + " ";
        }

        System.out.println("Reversed words: " + result.trim());
    }
}