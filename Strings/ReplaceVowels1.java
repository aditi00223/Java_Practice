package Strings;

public class ReplaceVowels1 {

    public static void main(String[] args) {

        String str = "hello world";

        String result = str.replaceAll("[aeiouAEIOU]", "*");

        System.out.println(result);
    }
}
    

