//Created by Khanhnvtb

package J07047;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DATA.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<LoaiPhong> lp = new ArrayList<>();
        while (t-- > 0) lp.add(new LoaiPhong(in.nextLine()));
        t = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++) kh.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        ArrayList<HoaDon> hd = new ArrayList<>();
        for (KhachHang k : kh)
            for (LoaiPhong l : lp) {
                if (l.getMa().equals(k.getMaPhong().substring(2, 3))) {
                    hd.add(new HoaDon(k, l));
                    break;
                }
            }
        Collections.sort(hd);
        for (HoaDon h : hd)
            System.out.println(h);
    }
}
