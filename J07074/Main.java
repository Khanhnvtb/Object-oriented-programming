package J07074;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONHOC.in"));
        HashMap<String, MonHoc> mon = new HashMap<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            mon.put(s, new MonHoc(s, in.nextLine(), in.nextLine()));
        }
        in = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<LichGD> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new LichGD(i, mon.get(in.nextLine()), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        MonHoc m = mon.get(in.nextLine());
        System.out.println("LICH GIANG DAY MON " + m + ":");
        for (LichGD l : a)
            if (l.getMon().equals(m)) System.out.println(l);
    }
}
