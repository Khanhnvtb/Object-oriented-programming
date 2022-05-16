package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        List<MatHang> l = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            l.add(new MatHang(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        Collections.sort(l);
        for (MatHang m : l) System.out.println(m);
    }
}
