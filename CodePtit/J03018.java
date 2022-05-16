//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int sum;
            if (s.length() > 1) sum = (s.charAt(s.length() - 2) - 48) * 10 + (s.charAt(s.length() - 1) - 48);
            else sum = s.charAt(s.length() - 1) - 48;
            if (sum % 4 == 0) System.out.println("4");
            else System.out.println("0");
        }
    }
}
