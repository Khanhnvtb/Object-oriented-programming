//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01010 {
    static char check(char c) {
        if (c == '0' || c == '8' || c == '9') return '0';
        else if (c == '1') return '1';
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                char c = check(s.charAt(i));
                if (c > '1') {
                    System.out.println("INVALID");
                    break;
                } else ans += c;
            }
            if (ans.length() == s.length()) {
                if (Long.parseLong(ans) != 0) System.out.println(Long.parseLong(ans));
                else System.out.println("INVALID");
            }
        }
    }
}
