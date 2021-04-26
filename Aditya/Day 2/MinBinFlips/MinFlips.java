//Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.
//Input: 
//S = "0001010111"
//Output: 2
//Explanation: We can flip the 1st and 8th bit
//to have "0101010101".

import java.util.*;

public class MinFlips {

    int countMinFlips(String s, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i += 2)
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String s = sc.nextLine();
        int n = s.length();
        MinFlips ob = new MinFlips();
        System.out.println("Minimum flips: " + ob.countMinFlips(s, n));
        sc.close();
    }
}
