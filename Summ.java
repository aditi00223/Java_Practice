import java.util.Scanner;
public class Summ {
    public static void main(String[] args){
        summ();  // calling a function

    }
    static void summ(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();
        int summ = a+b;
        System.out.println("sum is " + summ);
    }
    }
    

