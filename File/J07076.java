package File;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07076 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int n, m, k;
            n = in.nextInt();
            m = in.nextInt();
            k = in.nextInt() - 1;
            int a[][] = new int[n][m];
            ArrayList<Integer> ds = new ArrayList<>();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                    if (j == k) ds.add(a[i][j]);
                }
            Collections.sort(ds);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j == k) System.out.print(ds.get(i) + " ");
                    else System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
