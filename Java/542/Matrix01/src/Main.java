public class Main {
    public static int minLength(int[][] mat, int i, int j) {
        int minLen = Math.max(mat.length, mat[0].length);

        for (int k = i; k < i; k++) {

        }
        return minLen;
    }
    public static int[][] updateMatrix(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (mat[i][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}