//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int sumIndexEven = 0;
            int sumIndexOdd = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) sumIndexEven += s.charAt(i) - 48;
                else sumIndexOdd += s.charAt(i) - 48;
            }
            int sum = Math.abs(sumIndexEven - sumIndexOdd);
            if (sum % 11 == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
