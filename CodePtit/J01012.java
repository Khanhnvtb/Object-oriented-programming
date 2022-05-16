//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int res = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i != Math.sqrt(n)) {
                        if (i % 2 == 0) res++;
                        if ((n / i) % 2 == 0) res++;
                    } else {
                        if (i % 2 == 0) res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
