//Created by Khanhnvtb

package J07046;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (KhachHang k : a)
            System.out.println(k);
    }
}
