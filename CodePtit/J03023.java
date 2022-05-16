//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03023 {
    public static int digitRoman(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        return 1000;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int ans = digitRoman(s.charAt(0));
            int val1 = ans;
            int val2;
            for (int i = 1; i < s.length(); i++) {
                val2 = digitRoman(s.charAt(i));
                if (val2 > val1) val2 -= 2 * val1;
                ans += val2;
                val1 = val2;
            }
            System.out.println(ans);
        }
    }
}
