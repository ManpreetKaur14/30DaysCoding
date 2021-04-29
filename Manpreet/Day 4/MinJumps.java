import java.util.*;
class Main{
  public static void main(String args[]){
      int c=0;
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int j=arr[0];
  
    for(int i=0;i<n;i++)
    {
     if(arr[i]<n-arr[i])
     {
     j=arr[arr[i+1]];
     c++;
     }  
     else if(arr[])
     {
       j=arr[n-1];
         c++;
       break;
     }
    }
    System.out.println("the minimum jumps : "+c);
    sc.close();
  }

}