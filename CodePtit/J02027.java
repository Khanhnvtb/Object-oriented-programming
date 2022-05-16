//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02027 {
    static int a[];

    public static int upper_bound(int n, int s) {
        int mid;
        int low = 0;
        int high = n;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] > s) {
                if (mid == 0 || a[mid - 1] <= s) return mid;
                else high = mid - 1;
            } else {
                if (a[mid + 1] > s) return mid + 1;
                else low = mid + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a, 0, n);
            long res = 0;
            for (int i = 1; i < n; i++)
                res += i - upper_bound(i, a[i] - k);
            System.out.println(res);
        }
    }
}
