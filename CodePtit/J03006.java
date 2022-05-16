//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03006 {
    public static boolean isNiceNumber(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if ((int) s.charAt(l) % 2 == 1 || (int) s.charAt(l) % 2 == 1) return false;
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
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
