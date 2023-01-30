using System;

void Rotate(int[] nums, int k)
{
     k = k % nums.Length;
    // int[] help = new int[k];
    // for (int i = 0; i < k; i++)
    // {
    //     help[i] = nums[nums.Length - k + i];
    // }
    // for (int i = nums.Length - 1; i >= k; i--)
    // {
    //     nums[i] = nums[i - k];
    // }
    //
    // for (int i = 0; i < help.Length; i++)
    // {
    //     nums[i] = help[i];
    // }
    int prevIndex = 0;
    int prevValue = nums[0];
    int nextIndex;
    int nextValue;
    for (int i = 0; i < nums.Length; i++)
    {
        if ((prevIndex + k) > nums.Length - 1)
        {
            nextIndex = (prevIndex + k) % nums.Length;
        }
        else
        {
            nextIndex = prevIndex + k;
        }
        nextValue = nums[nextIndex];
        nums[nextIndex] = prevValue;
        prevValue = nextValue;
        prevIndex = nextIndex;
    }
    PrintArray(nums);
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

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write($"{array[i]} \t");
    }

    Console.WriteLine();
}

Console.Write("->");
int n = Convert.ToInt32(Console.ReadLine());
int[] nums = { -1, -100, 3, 99 };
Rotate(nums, 2);

//Console.WriteLine(2%6);

