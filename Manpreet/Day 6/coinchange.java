import java.util.*;
class coinchange
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins?");
        int n = sc.nextInt();
        System.out.println("Enter the change?");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the amount?");
        int amt = sc.nextInt();
        int table[][]=new int[n][amt+1];
        int m =0;
        for(m=arr[m];m<n;m++)
        {
            for(int j=0;j<=amt;j++)
            {
                table[m][0]=1;
            }
        }
        int i=0;
        for(i=arr[i];i<n;i++)
        {
            for(int j=0;j<=amt;j++)
            {
                if(arr[i]>j)
                table[i][j]=table[i-1][j];
                else
                table[i][j]=table[i-1][j]+table[i][j-arr[i]];
            }
        }
          System.out.println(Arrays.deepToString(table));
        
    }
}