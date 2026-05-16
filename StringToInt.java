public class StringToInt {
    public static void main(String[] args) {
        String s = "1234";
        int num = Integer.parseInt(s);
        System.out.println("String: " + s);
        System.out.println("Integer: " + num);
        System.out.println("After adding 10: " + (num + 10));
    }
}