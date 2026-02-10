public class UniqueNo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1  };
        int unique = findUnique(arr);
        System.out.println("The unique number is: " + unique);
    }

    static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }

    
}
