//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01017 {
    public static boolean isAdjacentNumber(String s) {
        for (int i = 1; i < s.length(); i++)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if (isAdjacentNumber(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
