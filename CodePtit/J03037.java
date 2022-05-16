//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        ArrayList<Integer> a = new ArrayList<>();
        int used[] = new int[100];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (used[val] == 0) {
                a.add(val);
                used[val] = 1;
            } else {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    for (int j = a.size() - 1; j >= 0; j--) {
                        if (a.get(j) == val) {
                            a.remove(j);
                            res += (a.size() - j);
                            break;
                        }
                    }
                } else a.remove(a.size() - 1);
            }
        }
        System.out.println(res);
    }
}
