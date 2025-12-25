public class Maximum
{
    public static void main(String[] args)
    {
        int[] arr = {89,90,2,13,145,536,78};
        int size = 7;
        System.out.println("Maximum element is" + maximum(arr,size));
    }

    static int maximum(int[] arr,int size)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
}
