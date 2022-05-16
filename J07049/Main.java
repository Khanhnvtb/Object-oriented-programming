//Created by Khanhnvtb

package J07049;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MUAHANG.in"));
        ArrayList<SanPham> sp = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0)
            sp.add(new SanPham(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        t = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            kh.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    in.nextLine()));
        ArrayList<HoaDon> hd = new ArrayList<>();
        for (KhachHang k : kh)
            for (SanPham s : sp) {
                if (s.getMa().equals(k.getMaSanPham())) {
                    hd.add(new HoaDon(k, s));
                    break;
                }
            }
        Collections.sort(hd);
        for (HoaDon h : hd)
            System.out.println(h);
    }
}
