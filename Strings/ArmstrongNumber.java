package Strings;
public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;   // you can change this
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits); // cast to int
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}