public class Stringlength {
    public static void main(String[] args) {
        // length of a string without using length() method
        String str = "Hello World";
        int length = 0;
        for(char c : str.toCharArray()) {
            length++;
        }


        System.out.println("Length of the string: " + length);
    
}
}
