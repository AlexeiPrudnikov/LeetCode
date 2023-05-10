public class Main {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int spiralOrder(int[][] matrix, int step, int startValue) {
        for (int i = step; i < matrix[0].length - step; i++) {
            matrix[step][i] = startValue++;
        }
        for (int i = step + 1; i < matrix.length - step; i++) {
           matrix[i][matrix[0].length - step - 1] = startValue++;
        }
        if (matrix.length - step - 1 > step) {
            for (int i = matrix[0].length - step - 2; i >= step; i--) {
                matrix[matrix.length - step - 1][i] = startValue++;
            }
        }
        if (matrix[0].length - step - 1 > step) {
            for (int i = matrix.length - step - 2; i >= step + 1; i--) {
                matrix[i][step] = startValue++;
            }
        }
        return startValue;
    }
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int cuttentValue = 1;
        for (int i = 0; i < n / 2 + 1; i++) {
            cuttentValue = spiralOrder(result, i, cuttentValue);
        }
        return result;
    }
    public static void main(String[] args) {
       printMatrix(generateMatrix(5));
    }
}