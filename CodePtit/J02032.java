//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[100];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int step = 0, state, size = 0;
            int res[] = new int[10000];
            for (int i = 0; i < n - 1; i++) {
                state = 0;
                for (int j = 0; j < n - i - 1; j++)
                    if (a[j] > a[j + 1]) {
                        int tmp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = tmp;
                        state = 1;
                    }
                if (state == 1) {
                    step++;
                    for (int j = 0; j < n; j++) res[size++] = a[j];
                } else break;
            }
            for (int i = size - n; i >= 0; i -= n) {
                System.out.print("Buoc " + step-- + ": ");
                for (int j = i; j < i + n; j++)
                    System.out.print(res[j] + " ");
                System.out.println();
            }
        }
    }
}
