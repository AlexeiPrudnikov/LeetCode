public class Main {

    public static int maxArea(int[] height) {
        int maxWater = -1;
        int leftPoint = 0;
        int rightPoint = height.length - 1;
        while (leftPoint != rightPoint) {
            maxWater = Math.max(maxWater, Math.min(height[leftPoint], height[rightPoint]) * (rightPoint - leftPoint));
            if (height[leftPoint] <= height[rightPoint]) {
                leftPoint++;
            }
            else {
                rightPoint--;
            }
        }
        return maxWater;
    }
    public static int maxArea2(int[] height) {
        int maxWater = -1;
        int currentValue;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                currentValue = Math.min(height[i], height[j]) * (j - i);
                if (maxWater < currentValue) {
                    maxWater = currentValue;
                    System.out.println(i + " " + j + " = " + maxWater);
                }
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] water = {10,14,10,4,10,2,6,1,6,12};
        System.out.println(maxArea(water));
    }
}