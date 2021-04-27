import java.util.*;
public class Palindromic {

    boolean isPalindrome(int n)
    {
        int bkp=n,r=0;
        while(n!=0)
        {
            r=(r*10)+(n%10);
            n/=10;
        }
        return bkp==r;
    }

    boolean checkPalindromic(int arr[], int n)
    {
        for(int i:arr)
            if(!isPalindrome(i))
                return false;

        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of thr array: ");
        int n=sc.nextInt();

        System.out.println("Now enter "+" "+n+" elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        Palindromic ob=new Palindromic();
        if(ob.checkPalindromic(arr, n))
            System.out.println("The above array is palindromic: TRUE");
        else
            System.out.println("The above array is not palindromic: FALSE");
    }
    
}
