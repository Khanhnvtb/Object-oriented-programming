//Created by Khanh Nguyen Van

package J05044;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new NhanVien(i, in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine())));
        }
        String s = in.nextLine();
        for (NhanVien n : a)
            if (n.getChucVu().equals(s))
                System.out.println(n);
    }
}
