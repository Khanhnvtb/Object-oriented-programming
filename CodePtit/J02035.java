//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02035 {
    static long a[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int state = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    state = i;
                    break;
                }
            }
            System.out.println(state);
        }
    }
}
