import java.util.*;

class fibonacci
{
    static int count = 0;
    static int fib(int n)
    {
        count++;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int sum = fib(n - 1) + fib(n - 2);
        return sum;
    }
public static void main(String[] args)
    {
        int s = fib(20);
    System.out.println(count);
    System.out.println(s);
    
    }
}