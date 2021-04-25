import java.util.*;
public class TripleSum{
    public static void main(String[] args) {
        int arr[]= new int[10];
        int l,r,i;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=sc.nextInt();
        for(i=0;i<10;i++){
        l=i+1;
        r=9;
        while (l < r) 
        {
            if (arr[i] + arr[l] + arr[r] == sum) {
                System.out.println("Triplets are: " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                System.exit(0);
            } else if (arr[i] + arr[l] + arr[r] < sum)
                l++;
            else
                r--;
        }
    }
    System.out.println("The triplet is dosent exixt");
        
    }  
}
