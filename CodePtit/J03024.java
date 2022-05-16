//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int state = 1;
            if (s.charAt(0) == '0') state = 0;
            else {
                for (int i = 0; i < s.length(); i++)
                    if (!Character.isDigit(s.charAt(i))) {
                        state = 0;
                        break;
                    }
            }
            if (state == 0) System.out.println("INVALID");
            else {
                int cnt = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) % 2 == 0) cnt++;
                    else cnt--;
                }
                if (cnt == 0) System.out.println("NO");
                else {
                    if (s.length() % 2 == 0 && cnt > 0) System.out.println("YES");
                    else if (s.length() % 2 == 1 && cnt < 0) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}

