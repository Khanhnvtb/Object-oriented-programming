//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01021 {
    static long m = 1000000007;

    public static long resPower(long a, long b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long tmp = resPower(a, b / 2);
        if (b % 2 == 0) return (tmp % m * tmp % m) % m;
        else return ((tmp) % m * (tmp % m) % m * a) % m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            long a = in.nextLong(), b = in.nextLong();
            if (a == 0 && b == 0) break;
            else System.out.println(resPower(a, b));
        }
    }
}
