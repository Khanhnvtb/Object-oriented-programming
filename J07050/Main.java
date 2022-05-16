package J07050;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            a.add(new MatHang(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine())));
        Collections.sort(a);
        for (MatHang m : a) System.out.println(m);
    }
}
