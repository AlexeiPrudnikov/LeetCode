public class Main {
    public static int pivotIndex(int[] nums) {

        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        if (left == right) return 0;
        for (int i = 1; i < nums.length ; i++) {
            left += nums[i-1];
            right -= nums[i];
            if (left == right) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
        System.out.println("Hello world!");
    }
}