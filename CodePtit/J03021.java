//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03021 {
    public static boolean isReversible(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next().toLowerCase();
            String tmp = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'c') tmp += '2';
                else if (s.charAt(i) >= 'd' && s.charAt(i) <= 'f') tmp += '3';
                else if (s.charAt(i) >= 'g' && s.charAt(i) <= 'i') tmp += '4';
                else if (s.charAt(i) >= 'j' && s.charAt(i) <= 'l') tmp += '5';
                else if (s.charAt(i) >= 'm' && s.charAt(i) <= 'o') tmp += '6';
                else if (s.charAt(i) >= 'p' && s.charAt(i) <= 's') tmp += '7';
                else if (s.charAt(i) >= 't' && s.charAt(i) <= 'v') tmp += '8';
                else tmp += '9';
            }
            if (isReversible(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
