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
        int table[][]=new int[n+1][amt+1];
        for(int m=0;m<=n;m++)
        {
                table[m][0]=1;
        }
        int i=0;
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=amt;j++)
            {
                if(arr[i-1]>j)
                table[i][j]=table[i-1][j];
                else
                table[i][j]=table[i-1][j]+table[i][j-arr[i-1]];
            }
        }
        System.out.println(table[n][amt]);
        
    }
}