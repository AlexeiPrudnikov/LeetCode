 using System;

 double FindMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] array = new int[nums1.Length + nums2.Length];
    int p1 = 0;
    int p2 = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (p1 >= nums1.Length)
        {
            array[i] = nums2[p2];
            p2++;
        }
        else
        {
            if (p2 >= nums2.Length)
            {
                array[i] = nums1[p1];
                p1++;
            }
            else
            {
                if (nums1[p1] <= nums2[p2])
                {
                    array[i] = nums1[p1];
                    p1++;
                }
                else
                {
                    array[i] = nums2[p2];
                    p2++;
                }
            }
        }
    }
    if (array.Length % 2 == 1)
    {
        return Convert.ToDouble(array[array.Length / 2]);
    }
    else
    {
        return Convert.ToDouble(array[array.Length / 2 - 1] + array[array.Length / 2]) / 2;
    }
} 
 int[] a = {1,2}; 
 int[] b = {3,4};
 Console.WriteLine(FindMedianSortedArrays(a,b));