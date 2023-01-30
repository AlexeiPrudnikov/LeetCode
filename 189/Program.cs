
void Rotate(int[] nums, int k) {
    int[] result = new int[nums.Length];
    nums = result;       
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
Rotate(nums, 3);
PrintArray(nums);


