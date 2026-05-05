import java.util.*;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
    }
}sc.close();