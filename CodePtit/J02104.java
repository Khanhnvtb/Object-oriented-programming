//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                a[i][j] = in.nextInt();
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (a[i][j] == 1 && i < j) System.out.println("(" + i + "," + j + ")");
    }
}
