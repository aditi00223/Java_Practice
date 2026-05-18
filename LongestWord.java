public class LongestWord {
    public static void main(String[] args) {
        String s = "I love Java Programming language";
        String[] words = s.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }

        System.out.println("Longest word: " + longest);
    }
}