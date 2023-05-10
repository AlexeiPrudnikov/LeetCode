import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static int[][] fillMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        Random random = new Random();
        int z = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = z++;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }

    public static List<Integer> spiralOrder(int[][] matrix, int step, List<Integer> result) {
        for (int i = step; i < matrix[0].length - step; i++) {
            result.add(matrix[step][i]);
        }
        for (int i = step + 1; i < matrix.length - step; i++) {
            result.add(matrix[i][matrix[0].length - step - 1]);
        }
        if (matrix.length - step - 1 > step) {
            for (int i = matrix[0].length - step - 2; i >= step; i--) {
                result.add(matrix[matrix.length - step - 1][i]);
            }
        }
        if (matrix[0].length - step - 1 > step) {
            for (int i = matrix.length - step - 2; i >= step + 1; i--) {
                result.add(matrix[i][step]);
            }
        }
        return result;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int steps = Math.min(matrix.length, matrix[0].length) + 1;
        for (int i = 0; i < steps / 2; i++) {
            result = spiralOrder(matrix, i, result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix(3, 1);
        printMatrix(matrix);
        System.out.println();
        List<Integer> result = spiralOrder(matrix);
        printList(result);
    }
}