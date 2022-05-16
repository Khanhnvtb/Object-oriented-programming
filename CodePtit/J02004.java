//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[100];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int state = 1;
            int l = 0, r = n - 1;
            while (l < r)
                if (a[l++] != a[r--]) {
                    state = 0;
                    break;
                }
            if (state == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
