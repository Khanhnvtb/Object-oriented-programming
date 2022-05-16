//Created by Khanhnvtb

package J07038;

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
        in = new Scanner(new File("DN.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<DoanhNghiep> dn = new ArrayList<>();
        while (t-- > 0)
            dn.add(new DoanhNghiep(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        in = new Scanner(new File("THUCTAP.in"));
        ArrayList<DanhSach> ds = new ArrayList<>();
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String maSV = in.next();
            String maDN = in.nextLine().substring(1);
            String tenDN = "";
            int soSV = 0;
            SinhVien s = null;
            for (DoanhNghiep d : dn)
                if (d.getMa().equals(maDN)) {
                    tenDN = d.getTen();
                    soSV = d.getSoSV();
                    break;
                }
            for (SinhVien i : sv)
                if (i.getMa().equals(maSV)) {
                    s = i;
                    break;
                }
            ds.add(new DanhSach(maDN, tenDN, s, soSV));
        }
        t = Integer.parseInt(in.nextLine());
        Collections.sort(ds);
        while (t-- > 0) {
            String maDN = in.nextLine();
            String tenDN = "";
            for (DanhSach d : ds)
                if (d.getMa().equals(maDN)) {
                    tenDN = d.getTen();
                    break;
                }
            System.out.println("DANH SACH THUC TAP TAI " + tenDN + ":");
            int cnt = 0;
            for (DanhSach d : ds) {
                if (d.getMa().equals(maDN)) {
                    System.out.println(d);
                    cnt++;
                    if (cnt == d.getSoSV()) break;
                }
            }
        }
    }
}
