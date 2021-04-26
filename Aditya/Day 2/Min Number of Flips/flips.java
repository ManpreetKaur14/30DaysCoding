import java.util.*;
public class flips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,c=0;
        String s = sc.nextLine();
        while(i<s.length()-2)
        {
            if(s.charAt(i)!=s.charAt(i+2))
            {
                c++;
            }
                i++;
        }
        System.out.println(c); 
    }
    
}
`