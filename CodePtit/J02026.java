//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02026 {
    static int n, k, a[], res[] = new int[15];
    static int inDex = 0;

    public static void print() {
        for (int i = 0; i < k; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }

    public static void Try(int i) {
        res[inDex++] = a[i];
        if (inDex == k) print();
        else {
            if (i < n - 1) Try(i + 1);
        }
        inDex--;
        if (i < n - 1) Try(i + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            Arrays.sort(a, 0, n);
            Try(0);
        }
    }
}
