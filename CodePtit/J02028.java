//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            int inDex = 0, state = 0;
            if (k == 0) {
                for (int i = 0; i < n; i++)
                    if (a[i] == 0) {
                        state = 1;
                        break;
                    }
            } else {
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                    if (sum == k) {
                        state = 1;
                        break;
                    } else if (sum > k) {
                        while (inDex <= i) {
                            sum -= a[inDex++];
                            if (sum < k) break;
                            if (sum == k) {
                                state = 1;
                                break;
                            }
                        }
                    }
                }
            }
            if (state == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
