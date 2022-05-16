//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int cnt = 1, res = 0, rota = 0, inDex = 0;
        int a[] = new int[1000000];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (cnt == 1) {
                    if (s.charAt(i) == 'A') a[inDex++] = -1;
                    else a[inDex++] = 1;
                } else {
                    if (s.charAt(i) == 'A') a[inDex++] = -2;
                    else a[inDex++] = 2;
                }
                cnt = 1;
            } else cnt++;
        }
        if (cnt == 1) {
            if (s.charAt(s.length() - 1) == 'A') a[inDex] = 1;
            else a[inDex] = -1;
        } else {
            if (s.charAt(s.length() - 1) == 'A') a[inDex] = 2;
            else a[inDex] = -2;
        }
        while (inDex >= 0) {
            if (Math.abs(a[inDex]) == 1) {
                if (a[inDex] < 0) {
                    res += 1;
                    inDex -= 2;
                    if (inDex >= 0 && rota % 2 == 1) a[inDex] = -a[inDex];
                } else {
                    inDex--;
                    if (inDex >= 0 && rota % 2 == 1) a[inDex] = -a[inDex];
                }
            } else {
                if (a[inDex] < 0) {
                    res += 1;
                    inDex -= 1;
                    rota += 1;
                    if (inDex >= 0 && rota % 2 == 1) a[inDex] = -a[inDex];
                } else {
                    inDex--;
                    if (inDex >= 0 && rota % 2 == 1) a[inDex] = -a[inDex];
                }
            }
        }
        System.out.println(res);
    }
}
