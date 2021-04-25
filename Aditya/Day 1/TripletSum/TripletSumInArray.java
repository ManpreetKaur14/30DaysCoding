//Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
//return true if the triplet exists else false

import java.util.*;

public class TripletSumInArray {
    boolean findTriplet(int arr[], int sum) {
        int l, r;
        for (int i = 0; i < arr.length; i++) {
            l = i + 1;
            r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == sum) {
                    System.out.println("Triplets are: " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                    return true;
                } else if (arr[i] + arr[l] + arr[r] < sum)
                    l++;
                else
                    r--;
            }
        }
        System.out.println("Triplets does not exist!");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[], sum;
        arr = new int[n];
        System.out.println("Now enter " + n + " elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter the sum: ");
        sum = sc.nextInt();
        TripletSumInArray ob = new TripletSumInArray();
        ob.findTriplet(arr, sum);
        sc.close();
    }
}
