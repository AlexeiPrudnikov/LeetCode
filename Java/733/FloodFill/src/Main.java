public class Main {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color != image[sr][sc]) {
            int originColor = image[sr][sc];
            image[sr][sc] = color;
            if (sc - 1 >= 0 && image[sr][sc - 1] == originColor) {
                floodFill(image, sr, sc - 1, color);
            }
            if (sr - 1 >= 0 && image[sr - 1][sc] == originColor) {
                floodFill(image, sr - 1, sc, color);
            }
            if (sc + 1 < image[sr].length && image[sr][sc + 1] == originColor) {
                floodFill(image, sr, sc + 1, color);
            }
            if (sr + 1 < image.length && image[sr + 1][sc] == originColor) {
                floodFill(image, sr + 1, sc, color);
            }
        }
        return image;
    }
    public static void print2DArray(int[][] image) {
        for (int[] row : image) {
            for (int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,0,0},{1,0,1}};
        image = floodFill(image,1,1,0);
        print2DArray(image);
    }
}