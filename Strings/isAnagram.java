package Strings;

class isAnagram {
    public boolean checkAnagram(String s, String t) {
        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] count = new int[26];

        // Step 3: Traverse both strings
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  
            count[t.charAt(i) - 'a']--;  
        }

        // 🔥 Step 4: Final check (YOU MISSED THIS)
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}