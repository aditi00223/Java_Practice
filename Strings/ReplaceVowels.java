package Strings;

public class ReplaceVowels {
    
    public static void main(String[] args) {

        String str = "hello world";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || 
                ch == 'O' || ch == 'U') {

                result += '*';  // replace vowel
            } else {
                result += ch;   // keep same
            }
        }

        System.out.println(result);
    }
}
    

