//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01007 {
    static long F[] = new long[100];

    public static void createFibo() {
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i < 93; i++)
            F[i] = F[i - 1] + F[i - 2];
    }

    public static void main(String[] args) {
        createFibo();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            int state = 0;
            for (int i = 0; i < 93; i++) {
                if (F[i] == n) {
                    state = 1;
                    break;
                } else if (F[i] > n) break;
            }
            if (state == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
