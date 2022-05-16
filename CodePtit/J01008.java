//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = in.nextInt();
            int P[] = new int[100];
            int i = 2, k = 0;
            while (n > 1) {
                if (n % i == 0) {
                    P[k++] = i;
                    n /= i;
                } else i++;
            }
            System.out.print("Test " + test + ": " + P[0]);
            int cnt = 1;
            for (i = 1; i < k; i++) {
                if (P[i] != P[i - 1]) {
                    System.out.print("(" + cnt + ") " + P[i]);
                    cnt = 1;
                } else cnt++;
            }
            System.out.println("(" + cnt + ") ");
        }
    }
}
