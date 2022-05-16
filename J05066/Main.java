//Created by Khanh Nguyen Van

package J05066;

import java.util.*;

public class Main {
    public static boolean check(String s1, String s2) {
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            String tmp = s1.substring(i, i + s2.length());
            if (tmp.equals(s2)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        while (t-- > 0) {
            String s = in.nextLine();
            String s1 = "";
            String s2 = s.substring(8);
            String tmp = s.substring(0, 2);
            if (tmp.equals("TP")) {
                int cnt = Integer.parseInt(s.substring(4, 7));
                if (cnt > 3) s1 = "NV" + s.substring(2, 7);
                else s1 = "TP" + s.substring(2, 7);
            } else if (tmp.equals("GD")) {
                int cnt = Integer.parseInt(s.substring(4, 7));
                if (cnt > 1) s1 = "NV" + s.substring(2, 7);
                else s1 = "GD" + s.substring(2, 7);
            } else if (tmp.equals("PP")) {
                int cnt = Integer.parseInt(s.substring(4, 7));
                if (cnt > 3) s1 = "NV" + s.substring(2, 7);
                else s1 = "PP" + s.substring(2, 7);
            } else {
                s1 = "NV" + s.substring(2, 7);
            }
            a.add(new NhanVien(s1, s2));
        }
        Collections.sort(a);
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            String s = in.nextLine();
            for (NhanVien n : a)
                if (check(n.getTen().toLowerCase(), s.toLowerCase())) System.out.println(n);
            System.out.println();
        }
    }
}
