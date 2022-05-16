//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02021 {
    static int a[] = new int[15];
    static int n, k, cnt = 0;

    public static void print() {
        for (int i = 1; i <= k; i++) System.out.print(a[i] + "");
        System.out.print(" ");
    }

    public static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i < k) Try(i + 1);
            else {
                cnt++;
                print();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
