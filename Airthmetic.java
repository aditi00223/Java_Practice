public class Airthmetic {
    public static void main(String[] args) {
        int ans = sum(10, 20);
        System.out.println(ans);
    }

    // scope of variables
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    
}
