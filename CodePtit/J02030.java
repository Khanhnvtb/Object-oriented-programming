//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int res[] = new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int step = n - 1, tmp, size = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[i]) {
                    tmp = a[i];
                    for (int k = i - 1; k >= j; k--) a[k + 1] = a[k];
                    a[j] = tmp;
                    break;
                }
            }
            for (int j = 0; j <= i; j++)
                res[size++] = a[j];
        }
        for (int i = size - n; i >= 0; i -= n) {
            System.out.print("Buoc " + step-- + ": ");
            for (int j = i; j < i + n; j++)
                System.out.print(res[j] + " ");
            System.out.println();
            n--;
            if (n <= 0) break;
        }
    }
}
