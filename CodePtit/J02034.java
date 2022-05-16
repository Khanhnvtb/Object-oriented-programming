//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        if (a[n - 1] == n) System.out.println("Excellent!");
        else {
            int prev = 1;
            for (int i = 0; i < n; i++) {
                if (a[i] > prev) {
                    while (prev < a[i]) {
                        System.out.println(prev);
                        prev++;
                    }
                }
                prev = a[i] + 1;
            }
        }
    }
}
