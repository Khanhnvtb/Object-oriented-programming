//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int step = 1, state;
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
                System.out.print("Buoc " + step++ + ": ");
                for (int j = 0; j < n; j++)
                    System.out.print(a[j] + " ");
                System.out.println();
            } else break;
        }
    }
}
