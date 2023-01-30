public class Main {
    public static int Search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int currentIndex = (rightIndex - leftIndex) / 2;
        while (nums[currentIndex] != target) {
            if (nums[currentIndex] == target) {
                return currentIndex;
            }
            if (leftIndex >= rightIndex) return -1;
            if (nums[currentIndex] < target) {
                leftIndex = currentIndex + 1;
            } else {
                rightIndex = currentIndex - 1;
            }
            currentIndex = (rightIndex - leftIndex) / 2 + leftIndex;
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5};
        System.out.println(Search(nums, 0));
    }
}