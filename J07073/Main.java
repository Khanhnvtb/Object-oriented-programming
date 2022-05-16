package J07073;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new MonHoc(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (MonHoc m : a)
            if (!m.getThucHanh().equals("Truc tiep")) System.out.println(m);
    }
}
