public class rev {

    static int reverse(int num){
    //num=123
    
    int rev=0;
    while(num!=0){
    int lastdigit=num%10;
    rev=rev*10+lastdigit;
    num=num/10;

    }    
      return rev;
    }

    public static void main(String[] args) {
        int result=reverse(123);
        System.out.println(result);
    }
}