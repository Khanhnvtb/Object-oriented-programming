//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02022 {
    static int a[] = new int[10];
    static int used[] = new int[10];
    static int n, state = 0;

    public static void printResult() {
        state = 1;
        for (int i = 0; i < n; i++) System.out.print(a[i]);
        System.out.println();
    }

    public static void Try(int i) {
        if (i == n) printResult();
        for (int j = 1; j <= n; j++) {
            if (i == 0 && used[j] == 0) {
                a[i] = j;
                used[j] = 1;
                Try(i + 1);
                used[j] = 0;
            } else if (i > 0 && used[j] == 0 && Math.abs(j - a[i - 1]) != 1) {
                a[i] = j;
                used[j] = 1;
                Try(i + 1);
                used[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            Try(0);
            if (state == 0) System.out.println();
        }
    }
}
