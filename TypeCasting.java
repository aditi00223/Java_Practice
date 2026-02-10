import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);
        // type casting

        int num = (int)(67.56f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257%256=1
        System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int result = (x * y) / z; // all the byte values are promoted to int
        System.out.println(result);
    }
    
}
