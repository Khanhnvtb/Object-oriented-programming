//Created by Khanhnvtb

package J07025;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            a.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        Collections.sort(a);
        for (KhachHang k : a) System.out.println(k);
    }
}
