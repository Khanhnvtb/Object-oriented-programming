//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int used[] = new int[125];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = (int) s.charAt(i);
            if (used[val] == 0) {
                res++;
                used[val] = 1;
            }
        }
        System.out.println(res);
    }
}
