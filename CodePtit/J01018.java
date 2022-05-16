//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int state = 1, sum = s.charAt(0) - 48;
            for (int i = 1; i < s.length(); i++) {
                sum += s.charAt(i) - 48;
                if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2) {
                    state = 0;
                    break;
                }
            }
            if (state == 1 && sum % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
