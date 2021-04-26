//Split the binary string into substrings with equal number of 0s and 1s
//Input: str = "0100110101"
//Output: 4

import java.util.*;
public class SplitBin {
    int maxSubStr(String s, int n) {
        int c0 = 0, c1 = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
                c0++;
            else
                c1++;

            if (c0 == c1)
                count++;
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String s = sc.nextLine();
        int n = s.length();
        SplitBin ob=new SplitBin();
        System.out.println("Number of binary strings: " + ob.maxSubStr(s, n));
        sc.close();
    }
}
