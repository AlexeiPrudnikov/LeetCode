public class Main {
    public static void moveZeroes(int[] nums) {
        int notNullIndex = 0;
        int nullIndex = 0;
        int temp;
        while (notNullIndex < nums.length & nullIndex < nums.length) {
            if (nums[notNullIndex] == 0) {
                if (nullIndex < notNullIndex) {
                    nullIndex++;
                }
                else {
                    if (nums[nullIndex] != 0) {
                        temp = nums[nullIndex];
                        nums[nullIndex] = nums[notNullIndex];
                        nums[notNullIndex] = temp;
                        notNullIndex++;
                    } else {
                        nullIndex++;
                    }
                }
            } else {
                notNullIndex++;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1, 0};
        //int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        printArray(nums);
        //System.out.println("Hello world!");
    }
}