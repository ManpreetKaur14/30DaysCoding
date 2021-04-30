import java.util.*;
public class Convertasentence 
{
    public static void main(String[] args) 
    {
        String str[] = {
            "2","22","222",
            "3","33","333",
            "4","44","444",
            "5","55","555",
            "6","66","666",
            "7","77","777","7777",
            "8","88","888",
            "9","99","999","9999"
         };
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the string:");
         String s=sc.nextLine();
         s=s.toUpperCase();
         String m="";
         int n = s.length();
            for (int i=0; i<n; i++)
            {
               if (s.charAt(i)== ' ')
                     m= m + "0";
               else 
               {
                    int  p = s.charAt(i)-'A';
                     m = m + str[p];
                }
            }
            System.out.println(m);
            sc.close();
              
    }
        
}
