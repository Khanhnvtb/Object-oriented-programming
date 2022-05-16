//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01006 {
    static long F[] = new long[100];

    public static void createFibo() {
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
            int n = in.nextInt();
            System.out.println(F[n]);
        }
    }
}
