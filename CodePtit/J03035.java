//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03035 {
    static long res;
    static int n;
    static String a, b;

    public static void Try(int i, int state, int cnt) {
        if (i == n) {
            res += cnt;
            return;
        }
        if (a.charAt(i) != '?') {
            if (state == 0) {
                if (a.charAt(i) < b.charAt(i)) return;
                else if (a.charAt(i) == b.charAt(i)) Try(i + 1, 0, 0);
                else Try(i + 1, 1, 1);
            } else Try(i + 1, 1, cnt);
        } else {
            if (state == 1) {
                if (cnt == 0) Try(i + 1, 1, 10);
                else Try(i + 1, 1, cnt * 10);
            } else {
                if (b.charAt(i) < '9') {
                    if (cnt == 0) Try(i + 1, 1, 57 - b.charAt(i));
                    else Try(i + 1, 1, cnt * 57 - b.charAt(i));
                    Try(i + 1, 0, 0);
                } else Try(i + 1, 0, 0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            a = in.next();
            b = in.next();
            n = a.length();
            res = 0;
            if (a.charAt(0) == '?') {
                if (b.charAt(0) == '9') Try(1, 0, 0);
                else {
                    Try(1, 1, 57 - b.charAt(0));
                    Try(1, 0, 0);
                }
            } else {
                if (a.charAt(0) > b.charAt(0)) Try(1, 1, 0);
                else if (a.charAt(0) == b.charAt(0)) Try(1, 0, 0);
            }
            System.out.println(res);
        }
    }
}
