//Convert a sentence into its equivalent mobile numeric keypad sequence
//Input : HELLO WORLD
//Output : 4433555555666096667775553

import java.util.*;

public class NumericKeypadSequance {
    String createSequence(String s) {
        int n = s.length();
        s = s.toUpperCase();
        String sequence = "";
        String arr[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
                "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
        char ch;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch == ' ')
                sequence += '0';
            else
                sequence += arr[ch - 'A'];
        }

        return sequence;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        NumericKeypadSequance ob = new NumericKeypadSequance();
        System.out.println("Keypad numeric sequence is: " + ob.createSequence(sc.nextLine()));
        sc.close();
    }
}
