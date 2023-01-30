import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> statArray = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (statArray.get(nums[i]) == null) {
                statArray.put(nums[i], 1);
            } else {
                statArray.put(nums[i], statArray.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: statArray.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println("Hello world!");
    }
}