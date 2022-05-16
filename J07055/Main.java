package J07055;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            a.add(new SinhVien(i, in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        Collections.sort(a);
        for (SinhVien s : a)
            System.out.println(s);
    }
}
