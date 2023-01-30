import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static int[] summDigits (int a, int b) {
        int[] result = new int [2];
        result[0] = (a + b) / 10;
        result[1] = (a + b) % 10;
        return result;
    }
    public static int[] plusOne(int[] digits) {
        int shift = 0;
        int[] res = summDigits(digits[digits.length -1], 1);
        List<Integer> resList = new ArrayList<>();
        resList.add(res[1]);
        shift = res[0];
        for (int i = digits.length - 2; i >=0; i--) {
            res = summDigits(digits[i], shift);
            resList.add(res[1]);
            shift = res[0];
        }
        if (shift != 0) resList.add(shift);
        Collections.reverse(resList);
        return resList.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(plusOne(digits).toString());
    }
}