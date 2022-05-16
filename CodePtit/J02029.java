//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int step = 0, size = 0;
            int res[] = new int[n*(n-1)];
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[i]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
                step++;
                for (int j = 0; j < n; j++) res[size++] = a[j];
            }
            for (int i = size - n; i >= 0; i -= n) {
                System.out.print("Buoc " + step-- + ": ");
                for (int j = i; j < i + n; j++) System.out.print(res[j] + " ");
                System.out.println();
            }
        }
    }
}
