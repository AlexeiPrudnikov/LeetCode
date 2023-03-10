public class Main {
    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return nums2;
        if (nums2.length == 0) return nums1;
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int[] result = new int[nums1.length + nums2.length];
        while (index1 != nums1.length || index2 != nums2.length) {
            if (index1 == nums1.length) {
                result[index] = nums2[index2];
                index2++;
            } else {
                if (index2 == nums2.length) {
                    result[index] = nums1[index1];
                    index1++;
                } else {
                    if (nums1[index1] < nums2[index2]) {
                        result[index] = nums1[index1];
                        index1++;
                    } else {
                        result[index] = nums2[index2];
                        index2++;
                    }
                }
            }
            index++;
        }
        return result;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = mergeArrays(nums1, nums2);
        double median = 0;
        if (merge.length % 2 == 0) {
            median = (double) (merge[merge.length / 2 - 1] + merge[merge.length / 2]) / 2;
        } else {
            median = merge[merge.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}