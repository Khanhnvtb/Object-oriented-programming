package J07084;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (SinhVien s : a)
            System.out.println(s);
    }
}
