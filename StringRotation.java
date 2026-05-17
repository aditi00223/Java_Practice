public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";
        
        if (s1.length() != s2.length()) {
            System.out.println("Not a rotation");
        } else if ((s1 + s1).contains(s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println("Not a rotation");
        }
    }
}