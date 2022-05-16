//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int a[] = new int[n];
        int cnt = 0;
        long res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            res += Math.abs(a[i]);
            if (a[i] < 0) cnt++;
        }
        if (cnt >= k) {
            Arrays.sort(a);
            for (int i = k; i < n; i++) {
                if (a[i] < 0) res += 2 * a[i];
                else break;
            }
        } else {
            k -= cnt;
            if (k % 2 != 0) {
                int minVal = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++)
                    if (Math.abs(a[i]) < minVal) minVal = Math.abs(a[i]);
                res -= 2 * minVal;
            }
        }
        System.out.println(res);
    }
}
