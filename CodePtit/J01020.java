//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01020 {
    static int used[] = new int[10];
    static int cnt;

    public static void check(int n) {
        while (n > 0) {
            int x = n % 10;
            if (used[x] == 0) {
                used[x] = 1;
                cnt++;
            }
            n /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n == 0) System.out.println("Impossible");
            else {
                for (int i = 0; i < 10; i++) used[i] = 0;
                int i = 1;
                cnt = 0;
                check(n);
                while (cnt < 10) {
                    i++;
                    check(n * i);
                }
                System.out.println(n * i);
            }
        }
    }
}
