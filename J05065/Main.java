//Created by Khanh Nguyen Van

package J05065;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        int cntGD = 0, cntTP = 0, cntPP = 0;
        while (t-- > 0) {
            String s = in.nextLine();
            String s1 = "";
            String s2 = s.substring(8);
            String tmp = s.charAt(0) + "" + s.charAt(1);
            if (tmp.equals("TP")) {
                cntTP++;
                if (cntTP > 3) s1 = "NV" + s.substring(2, 7);
                else s1 = "TP" + s.substring(2, 7);
            } else if (tmp.equals("GD")) {
                cntGD++;
                if (cntGD > 1) s1 = "NV" + s.substring(2, 7);
                else s1 = "GD" + s.substring(2, 7);
            } else if (tmp.equals("PP")) {
                cntPP++;
                if (cntPP > 3) s1 = "NV" + s.substring(2, 7);
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
                if (n.getMa().equals(s)) System.out.println(n);
            System.out.println();
        }
    }
}
