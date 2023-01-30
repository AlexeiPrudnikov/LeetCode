import java.util.Arrays;

public class Main {
    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(nums.length + k + i) % nums.length] = nums[i];
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
        //nums = new int[result.length];
        //nums = Arrays.copyOf(result, result.length);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        printArray(nums);
    }
}