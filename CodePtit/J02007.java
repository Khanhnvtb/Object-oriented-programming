//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = in.nextInt();
            int used[] = new int[100000];
            for (int i = 0; i < 100000; i++) used[i] = 0;
            int a[] = new int[100];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                used[a[i]]++;
            }
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++)
                if (used[a[i]] != 0) {
                    System.out.println(a[i] + " xuat hien " + used[a[i]] + " lan");
                    used[a[i]] = 0;
                }
        }
    }
}
