//Created by Khanhnvtb

package J07035;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        in.close();
        HashMap<String, String> hm = new HashMap<>();
        in = new Scanner(new File("MONHOC.in"));
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            hm.put(in.nextLine(), in.nextLine());
            in.nextLine();
        }
        in.close();
        in = new Scanner(new File("BANGDIEM.in"));
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String maMon, maSV;
            double diem;
            String str[] = in.nextLine().split(" ");
            maMon = str[1];
            maSV = str[0];
            diem = Double.parseDouble(str[2]);
            for (SinhVien s : a) {
                if (s.getMa().equals(maSV))
                    s.tinhDiem(maMon, diem);
            }
        }
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            System.out.println("BANG DIEM MON " + hm.get(s) + ":");
            ArrayList<BangDiem> ds = new ArrayList<>();
            for (SinhVien sv : a) {
                HashMap<String, Double> h = sv.getHm();
                if (h.containsKey(s)) {
                    ds.add(new BangDiem(sv, sv.getDiem(s)));
                }
            }
            Collections.sort(ds);
            for (BangDiem b : ds)
                System.out.println(b);
        }
        in.close();
    }
}
