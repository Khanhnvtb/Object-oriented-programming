//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01022 {
    static long F[] = new long[100];

    public static void createFibo() {
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i < 93; i++)
            F[i] = F[i - 1] + F[i - 2];
    }

    public static int find(int n, long k) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        if (k <= F[n - 2]) return find(n - 2, k);
        else return find(n - 1, k - F[n - 2]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        createFibo();
        while (t-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(find(n, k));
        }
    }
}
