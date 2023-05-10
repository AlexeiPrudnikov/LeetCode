import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String result = "";
        char[] mainStr = s.toCharArray();
        char [] res = new char[mainStr.length];
        int index = 0;
        boolean isDown = true;
        char[][] matrix = new char[numRows][s.length() / 2 + 1];
        int row = 0;
        int column = 0;
        char letter;
        while (index < mainStr.length)
        {
            letter = s.charAt(index);
            matrix[row][column] = letter;
            if (isDown) {
                if (row + 1 < matrix.length) {
                    row++;
                } else {
                    row--;
                    column++;
                    isDown = false;
                }
            } else {
                if (row - 1 < 0) {
                    row++;
                    isDown = true;
                } else {
                    row--;
                    column++;
                }
            }
            index++;
        }
        index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    res[index] = matrix[i][j];
                    index++;
                }
            }
        }
        result = String.valueOf(res);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("A", 1));

    }
}