package Strings;

public class reverseVowels {
    

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' 
            || c == 'o' || c == 'u';
    }

    // 🔥 Main method added
    public static void main(String[] args) {
        String input = "hello";

        String result = reverseVowels(input);

        System.out.println("Original String: " + input);
        System.out.println("After Reversing Vowels: " + result);
    }
}

    
