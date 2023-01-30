public class Main {
    public static int areaOfIslands(int[][] grid, int sr, int sc, int size) {
        size++;
        grid[sr][sc] = 2;
        if (sc - 1 >= 0 && grid[sr][sc - 1] == 1) {
            size = areaOfIslands(grid, sr, sc - 1, size);
        }
        if (sr - 1 >= 0 && grid[sr - 1][sc] == 1) {
            size = areaOfIslands(grid, sr - 1, sc, size);
        }
        if (sc + 1 < grid[sr].length && grid[sr][sc + 1] == 1) {
            size = areaOfIslands(grid, sr, sc + 1, size);
        }
        if (sr + 1 < grid.length && grid[sr + 1][sc] == 1) {
            size = areaOfIslands(grid, sr + 1, sc, size);
        }
        return size;
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    area = areaOfIslands(grid, i, j, 0);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }

            }
        }
        return maxArea;
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
        int[][] grid1 = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int[][] grid2 = {{0,0,0,0,0,0,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid2));
    }
}