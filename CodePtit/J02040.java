//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02040 {
    static boolean locPhat(char c) {
        if (c == '6' || c == '8') return true;
        return false;
    }

    static boolean bienDep(String s) {
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        if (locPhat(s.charAt(0)) && locPhat(s.charAt(1)) && locPhat(s.charAt(2)) && locPhat(s.charAt(3)) &&
                locPhat(s.charAt(4)))
            return true;
        for (int i = 1; i < 5; i++) {
            if (s.charAt(i) <= s.charAt(i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if (bienDep(s.substring(5, 8) + s.substring(9))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
