import java.util.*;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        String s = sc.nextLine();
        int c=0,c0=0,c1=0;
        for(i=0;i<s.length();i++)
        {
            if (s.charAt(i) == '0') 
            {
                c0++;
            }
            else
            {
                c1++;
            }
            if(c0==c1)
            {
                c++;
            }
            
        }
        System.out.println(c); 
    }
    
}