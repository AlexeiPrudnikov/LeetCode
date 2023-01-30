int[] SortedSquares(int[] nums) {
    int minIndex = 0;
    int minValue = nums[0];
    for(int i = 0; i < nums.Length - 1; i++)
    {
        minIndex = i;
        minValue = nums[i];
        for (int j = i; j < nums.Length; j++)
        {
            if (nums[j] < minValue) 
            {
                minIndex = j;
                minValue = nums[j];
            }
        }
        if (minIndex != i)
        {
            (nums[i], nums[minIndex]) = (nums[minIndex], nums[i]);
        }
    }
    return nums;
}
int[] FillArray(int len)
{
    int[] temp = new int[len];
    for (int z = 0; z < temp.Length; z++)
    {
        temp[z] = new Random().Next(-10, 10);
    }
    return temp;
}
void PrintArray (int[] array)
{
    for(int i = 0; i < array.Length; i++)
    {
        Console.Write($"{array[i]} \t");
        
    }
    Console.WriteLine();
}
Console.Write("->");
int n = Convert.ToInt32(Console.ReadLine());
int[] nums = FillArray(n);
PrintArray(nums);
PrintArray(SortedSquares(nums));


