//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0, cnt = 0;
        int a[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] == 1) cnt++;
                else cnt--;
            }
            if (cnt > 0) res++;
            cnt = 0;
        }
        System.out.println(res);
    }
}
