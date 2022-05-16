//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            System.out.println((n + 1) * n / 2);
        }
    }
}
