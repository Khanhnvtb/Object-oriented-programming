//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int step = 0, tmp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[i]) {
                    tmp = a[i];
                    for (int k = i - 1; k >= j; k--) a[k + 1] = a[k];
                    a[j] = tmp;
                    break;
                }
            }
            System.out.print("Buoc " + step++ + ": ");
            for (int j = 0; j <= i; j++)
                System.out.print(a[j] + " ");
            System.out.println();
        }
    }
}
