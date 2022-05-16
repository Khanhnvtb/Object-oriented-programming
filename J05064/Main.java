//Created by Khanh Nguyen Van

package J05064;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<GiaoVien> a = new ArrayList<>();
        int cntHT = 0, cntHP = 0;
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String s = in.nextLine();
            String tmp = s.charAt(0) + "" + s.charAt(1);
            if (tmp.equals("HT")) {
                cntHT++;
                if (cntHT < 2) a.add(new GiaoVien(s, in.nextLine(), Integer.parseInt(in.nextLine())));
                else {
                    in.nextLine();
                    in.nextLine();
                }
            } else if (tmp.equals("HP")) {
                cntHP++;
                if (cntHP < 3) a.add(new GiaoVien(s, in.nextLine(), Integer.parseInt(in.nextLine())));
                else {
                    in.nextLine();
                    in.nextLine();
                }
            } else a.add(new GiaoVien(s, in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        for (GiaoVien g : a)
            System.out.println(g);
    }
}
