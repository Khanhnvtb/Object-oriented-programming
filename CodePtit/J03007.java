//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03007 {
    public static boolean isNiceNumber(String s) {
        int l = 0, r = s.length() - 1;
        if (s.charAt(l) != '8' || s.charAt(r) != '8') return false;
        int sum = 0;
        while (l < r) {
            sum += s.charAt(l) - 48;
            sum += s.charAt(r) - 48;
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        if (l == r) sum += s.charAt(l) - 48;
        if (sum % 10 != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if (isNiceNumber(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
