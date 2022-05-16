//Created by Khanh Nguyen Van

package J05034;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThucTapSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new ThucTapSinh(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            String s = in.nextLine();
            ArrayList<ThucTapSinh> res = new ArrayList<>();
            for (ThucTapSinh t : a) {
                if (t.getDoanhNhgiep().compareTo(s) == 0) res.add(t);
            }
            Collections.sort(res);
            for (ThucTapSinh t : res)
                System.out.println(t);
        }
    }
}
