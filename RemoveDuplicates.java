

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";
        for (char c : s.toCharArray()) {
            if (result.indexOf(c) == -1)
                result += c;
        }
        System.out.println("After removing duplicates: " + result);
    }
}