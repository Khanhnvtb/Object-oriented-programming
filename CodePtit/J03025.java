//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int l = 0, r = s.length() - 1, cnt = 0;
            while (l < r) {
                if (s.charAt(l++) != s.charAt(r--)) cnt++;
                if (cnt > 1) break;
            }
            if (s.length() % 2 == 0) {
                if (cnt == 1) System.out.println("YES");
                else System.out.println("NO");
            } else {
                if (cnt < 2) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
