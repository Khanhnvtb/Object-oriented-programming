//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (Math.sqrt(n) == (int) Math.sqrt(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
