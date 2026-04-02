package Strings;

class isAnagram {

    public boolean checkAnagram(String s, String t) {
        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

    
        int[] count = new int[26];

        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  
            count[t.charAt(i) - 'a']--;  
        }

        // Step 4: Final check
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        isAnagram obj = new isAnagram();

        String s = "listen";
        String t = "silent";

        boolean result = obj.checkAnagram(s, t);

        if (result) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are NOT Anagram");
        }
    }
}