package J07081;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (SinhVien s : a)
            System.out.println(s);
    }
}
