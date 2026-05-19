public class MostFrequentWord {
    public static void main(String[] args) {
        String s = "apple banana apple mango banana apple";
        String[] words = s.split(" ");
        String maxWord = "";
        int maxCount = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxWord = words[i];
            }
        }

        System.out.println("Most frequent word: " + maxWord);
        System.out.println("Count: " + maxCount);
    }
}