//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02008 {
    static Scanner in = new Scanner(System.in);

    public static long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    public static long LCM(long a, long b) {
        return a / GCD(a, b) * b;
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextInt();
            long res = n;
            for (long i = n - 1; i > 0; i--)
                if (res % i != 0) res = LCM(res, i);
            System.out.println(res);
        }
    }
}
