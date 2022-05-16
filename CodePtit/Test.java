//Created by Khanhnvtb

package CodePtit;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        long res = 0;
        while (n-- > 0) {
            String s1 = in.next();
            String s2 = in.nextLine().substring(1);
            String s = s1.substring(0, 2) + s2;
            if (!lhm.containsKey(s)) lhm.put(s, 1);
            else lhm.put(s, lhm.get(s) + 1);
        }
        for (String s : lhm.keySet()) {
            String str = s.substring(2) + s.substring(0, 2);
            if (lhm.containsKey(str)) res += (long) lhm.get(s) * lhm.get(str);
        }
        res /= 2;
        System.out.println(res);
    }
}
