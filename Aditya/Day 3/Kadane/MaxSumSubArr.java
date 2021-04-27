//Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum. 

import java.util.*;
class MaxSumSubArr
{
    
    int maxSum(int arr[], int n)
    {
        int Maxsum=0,presentSum=0;
        for(int i=0;i<n;i++)
        {
            presentSum+=arr[i];
            if(presentSum>Maxsum)
                Maxsum=presentSum;
            if(presentSum<0)
                presentSum=0;
        }
        return Maxsum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Now enter "+n+" numbers ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        MaxSumSubArr ob=new MaxSumSubArr();
        System.out.println("Sum of maximum subarray is: "+ob.maxSum(arr, n));

        sc.close();
    }
}