//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02024 {
    static int n, s = 0, inDex = 0, a[], res[] = new int[15];

    public static void print() {
        for (int i = 0; i < inDex; i++) System.out.print(res[i] + " ");
        System.out.println();
    }

    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            if (j == 0) {
                if (i == 0 && s % 2 == 1) print();
                else if (i > 0) Try(i - 1);
            } else {
                s += a[i];
                res[inDex++] = a[i];
                if (i == 0 && s % 2 == 1) print();
                else if (i > 0) Try(i - 1);
                inDex--;
                s -= a[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a, 0, n);
            Try(n - 1);
        }
    }
}
