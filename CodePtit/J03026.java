//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            if (!s1.equals(s2)) System.out.println(Math.max(s1.length(), s2.length()));
            else System.out.println(-1);
        }
    }
}
