public class Main {
    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 1) return 2;
            else return 1;
        }
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                temp[nums[i] - 1] = 1;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) return i + 1;
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 12,4,3};
        System.out.println(firstMissingPositive(nums));
    }
}