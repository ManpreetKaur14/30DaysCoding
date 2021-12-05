import java.util.*;

class memo 
{
    static int count = 0;
    static  int arr[]=new int[10];
    static int fib(int n)
    {
        count++;
        int sum =0;
           if(n==0 )
           {
            return 0;
            }
            else if(n==1)
            {
            arr[n]=1;
            return arr[n];
            } 
        else if (arr[n] != 0)
        {
            return arr[n];
        }
            else{
        sum = fib(n - 1) + fib(n - 2);
        arr[n] = sum;
        return sum;
            }
    }
    public static void main(String[] args)
    {
        arr[0]=1;
        arr[1]=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        System.out.print(count);
    }
}



