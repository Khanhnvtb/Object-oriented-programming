//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02103 {
    static Scanner in = new Scanner(System.in);
    static int a[][] = new int[1005][1005];
    static int aT[][] = new int[1005][1005];
    static int n, m;

    public static void input() {
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
    }

    public static void solve() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                aT[j][i] = a[i][j];
        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < m; k++)
                    res[i][j] += a[i][k] * aT[k][j];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            input();
            System.out.println("Test " + i + ":");
            solve();
        }
    }
}
