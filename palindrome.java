public class palindrome {

    static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;  
        }

        return original == rev;
    }

    public static void main(String[] args) {
        int number = 121;

       System.out.println(isPalindrome(number));
    }
}


    

