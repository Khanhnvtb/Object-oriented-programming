//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02016 {
    static int n;
    static long a[] = new long[5005];
    static Scanner in = new Scanner(System.in);

    public static void input() {
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            a[i] = a[i] * a[i];
        }
        Arrays.sort(a, 0, n);
    }

    public static void solve() {

        int state = 0;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (a[l] + a[r] == a[i]) {
                    state = 1;
                    break;
                }
                if (a[l] + a[r] < a[i]) l++;
                else r--;
            }
            if (state == 1) break;
        }
        if (state == 1) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            input();
            solve();
        }
    }
}
