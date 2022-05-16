//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            int sum = 0, res = -1;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if ((sum - a[i]) % 2 == 0 && tmp == (sum - a[i]) / 2) {
                    res = i + 1;
                    break;
                } else tmp += a[i];
            }
            System.out.println(res);
        }
    }
}
