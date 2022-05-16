package J05082;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        List<KhachHang> l = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            l.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        Collections.sort(l);
        for (KhachHang k : l) System.out.println(k);
    }
}
