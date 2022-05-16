//Created by Khanhnvtb

package J07036;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        while (t-- > 0)
            sv.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        in = new Scanner(new File("MONHOC.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> mh = new ArrayList<>();
        while (t-- > 0)
            mh.add(new MonHoc(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        in = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> bd = new ArrayList<>();
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String str[] = in.nextLine().split(" ");
            String maSV = str[0];
            String maMH = str[1];
            double diem = Double.parseDouble(str[2]);
            String tenMH = "";
            SinhVien s = null;
            for (MonHoc m : mh)
                if (m.getMa().equals(maMH)) {
                    tenMH = m.getTen();
                    break;
                }
            for (SinhVien i : sv)
                if (i.getMa().equals(maSV)) {
                    s = i;
                    break;
                }
            bd.add(new BangDiem(maMH, tenMH, s, diem));
        }
        t = Integer.parseInt(in.nextLine());
        Collections.sort(bd);
        while (t-- > 0) {
            String lop = in.nextLine();
            System.out.println("BANG DIEM lop " + lop + ":");
            for (BangDiem b : bd) {
                if (b.getSv().getLop().equals(lop)) {
                    System.out.println(b);
                }
            }
        }
    }
}
