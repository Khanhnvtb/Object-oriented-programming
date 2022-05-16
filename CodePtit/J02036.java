//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02036 {
    public static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            System.out.print(a[0] + " ");
            for (int i = 1; i < n; i++)
                System.out.print(lcm(a[i], a[i - 1]) + " ");
            System.out.println(a[n - 1]);
        }
    }
}
