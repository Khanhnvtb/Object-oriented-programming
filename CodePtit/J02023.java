//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02023 {
    static int n, s;

    public static void createNumber() {
        if (s / 9 > n) System.out.print("-1 -1");
        else if (s / 9 == n) {
            if (s % 9 == 0) {
                for (int i = 1; i <= n; i++) System.out.print(9);
                System.out.print(" ");
                for (int i = 1; i <= n; i++) System.out.print(9);
            } else System.out.print("-1 -1");
        } else if (s / 9 < n && s != 0) {
            if (s % 9 == 0) {
                System.out.print(1);
                for (int i = 1; i < n - s / 9; i++) System.out.print(0);
                System.out.print(8);
                for (int i = 1; i < s / 9; i++) System.out.print(9);
                System.out.print(" ");
                for (int i = 0; i < s / 9; i++) System.out.print(9);
                for (int i = 0; i < n - s / 9; i++) System.out.print(0);
            } else {
                if (n - s / 9 == 1) {
                    System.out.print(s % 9);
                    for (int i = 0; i < s / 9; i++) System.out.print(9);
                    System.out.print(" ");
                    for (int i = 0; i < s / 9; i++) System.out.print(9);
                    System.out.print(s % 9);
                } else {
                    System.out.print(1);
                    for (int i = 1; i < n - s / 9 - 1; i++) System.out.print(0);
                    System.out.print(s % 9 - 1);
                    for (int i = 1; i <= s / 9; i++) System.out.print(9);
                    System.out.print(" ");
                    for (int i = 0; i <= s / 9 - 1; i++) System.out.print(9);
                    System.out.print(s % 9);
                    for (int i = 1; i < n - s / 9; i++) System.out.print(0);
                }
            }
        } else if (s == 0 && s / 9 < n) System.out.print("-1 -1");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = in.nextInt();
        createNumber();
    }
}
