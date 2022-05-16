//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt(), k = in.nextInt();
            long res = 0;
            LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (!lhm.containsKey(a[i])) lhm.put(a[i], 1);
                else lhm.put(a[i], lhm.get(a[i]) + 1);
            }
            for (int i = 0; i < n; i++)
                if (lhm.containsKey(k - a[i])) {
                    if (a[i] == k - a[i]) {
                        res += (long) lhm.get(a[i]) * (lhm.get(a[i]) - 1) / 2;
                        lhm.remove(a[i]);
                    } else {
                        res += (long) lhm.get(a[i]) * lhm.get(k - a[i]);
                        lhm.remove(a[i]);
                        lhm.remove(k - a[i]);
                    }
                }
            System.out.println(res);
        }
    }
}
