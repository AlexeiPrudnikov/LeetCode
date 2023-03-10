public class Main {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[result-1]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}