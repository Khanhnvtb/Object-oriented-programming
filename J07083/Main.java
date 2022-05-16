package J07083;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        HashMap<String, SinhVien> sv = new HashMap<>();
        while (t-- > 0) {
            String s = in.nextLine();
            sv.put(s, new SinhVien(s, in.nextLine(), in.nextLine(), in.nextLine()));
        }
        in = new Scanner(new File("DETAI.in"));
        t = Integer.parseInt(in.nextLine());
        HashMap<String, DeTai> dt = new HashMap<>();
        for (int i = 1; i <= t; i++) {
            dt.put(String.format("DT%03d", i), new DeTai(i, in.nextLine(), in.nextLine()));
        }
        in = new Scanner(new File("HOIDONG.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<HoiDong> a = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        while (t-- > 0) {
            String s[] = in.nextLine().split(" ");
            if (!hm.containsKey(s[2])) {
                a.add(new HoiDong(sv.get(s[0]), dt.get(s[1]), s[2]));
                hm.put(s[2], 1);
            } else {
                for (HoiDong h : a) {
                    if (h.getMa() == s[2].charAt(2)) {
                        h.addNV(sv.get(s[0]), dt.get(s[1]));
                        break;
                    }
                }
            }
        }
        Collections.sort(a);
        for (HoiDong h : a) {
            System.out.println("DANH SACH HOI DONG " + h.getMa() + ":");
            h.sort();
            System.out.print(h);
        }
    }
}
