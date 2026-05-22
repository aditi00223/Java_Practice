public class DuplicateWords {
    public static void main(String[] args) {
        String s = "hello world java hello programming world java";
        String[] words = s.split(" ");

        System.out.println("Duplicate words:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }
    }
}