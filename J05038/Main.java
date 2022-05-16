//Created by Khanh Nguyen Van

package J05038;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        long tongLuong = 0;
        for (int i = 1; i <= t; i++) {
            NhanVien n = new NhanVien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()),
                    in.nextLine());
            a.add(n);
            tongLuong += n.getThucLinh();
        }
        for (NhanVien n : a)
            System.out.println(n);
        System.out.println("Tong chi phi tien luong: " + tongLuong);
    }
}
