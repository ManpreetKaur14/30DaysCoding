import java.util.*;
class Kadane
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,f=0,h=0;
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
                h = h + arr[i];
                if (f < h)
                    f = h;
                if (h < 0)
                    h = 0;
        }
            System.out.println("The maximum sum of the subarray is : "+f);
        }
}