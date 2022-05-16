//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int k = in.nextInt();
            int used[] = new int[125];
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                int val = s.charAt(i);
                if (used[val] == 0) {
                    res++;
                    used[val] = 1;
                }
            }
            if (k <= s.length() - res && k >= 26 - res) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
