import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int maxIncome = 0;
        int currentIncome = 0;
        
        return maxIncome;
    }
    public static void main(String[] args) {
        System.out.println(rob(new int[] {4,1,2,7,5,3,1}));
    }
}