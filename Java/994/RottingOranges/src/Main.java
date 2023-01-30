public class Main {
    public static int orangesRotting(int[][] grid) {
        int result = 0;
        int step = 2;
        boolean isRotting = true;
        while (isRotting) {
            isRotting = false;
            for (int i = 0; i < grid[0].length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    if (grid[j][i] == step) {
                        if (j - 1 >= 0 && grid[j - 1][i] == 1) {
                            grid[j - 1][i] = step + 1;
                            isRotting = true;
                        }
                        if (j + 1 < grid.length && grid[j + 1][i] == 1) {
                            grid[j + 1][i] = step + 1;
                            isRotting = true;
                        }
                        if (i - 1 >= 0 && grid[j][i - 1] == 1) {
                            grid[j][i - 1] = step + 1;
                            isRotting = true;
                        }
                        if (i + 1 < grid[0].length && grid[j][i + 1] == 1) {
                            grid[j][i + 1] = step + 1;
                            isRotting = true;
                        }
                    }
                }
            }

            if (isRotting) {
                step++;
                result++;
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] == 1) return -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //int[][] grid = grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] grid = grid = new int[][]{{0, 2}};
        System.out.println(orangesRotting(grid));
        System.out.println("Hello world!");
    }
}