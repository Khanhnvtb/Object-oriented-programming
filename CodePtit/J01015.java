//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01015 {
    public static boolean isTernaryDiGit(char c) {
        if (c != '0' && c != '1' && c != '2') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int state = 1;
            for (int i = 0; i < s.length(); i++) {
                if (!isTernaryDiGit(s.charAt(i))) {
                    state = 0;
                    break;
                }
            }
            if (state == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
