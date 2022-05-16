package J07082;

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
        in = new Scanner(new File("NHIEMVU.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<NhiemVu> a = new ArrayList<>();
        while (t-- > 0) {
            String ma = in.next();
            String de = in.nextLine().substring(1);
            a.add(new NhiemVu(sv.get(ma), dt.get(de)));
        }
        Collections.sort(a);
        for (NhiemVu n : a)
            System.out.println(n);
    }
}
