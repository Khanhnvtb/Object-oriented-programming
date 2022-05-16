//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01011 {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong(), b = in.nextLong();
            long GCD = gcd(a, b);
            long LCM = a / GCD * b;
            System.out.println(LCM + " " + GCD);
        }
    }
}
