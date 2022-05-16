package J07018;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        List<SinhVien> l = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            l.add(new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine())));
        for (SinhVien s : l) System.out.println(s);
    }
}

