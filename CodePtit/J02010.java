//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int step = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            System.out.print("Buoc " + step++ + ": ");
            for (int j = 0; j < n; j++) System.out.print(a[j] + " ");
            System.out.println();
        }
    }
}
