import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int[] sortedSquares(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]*nums[i]);
        }
        Collections.sort(result);
        return result.stream().mapToInt(i ->i).toArray();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}