package J07052;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new ThiSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        int chiTieu = Integer.parseInt(in.nextLine());
        Collections.sort(a);
        double diemChuan = a.get(chiTieu - 1).getDiemXetTuyen();
        System.out.printf("%.1f", diemChuan);
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            if (a.get(i).getDiemXetTuyen() >= diemChuan) System.out.println(" TRUNG TUYEN");
            else System.out.println(" TRUOT");
        }
    }
}
