//Created by Khanh Nguyen Van

package J05006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new NhanVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(),
                    in.nextLine()));
        }
        for (NhanVien tmp : a)
            System.out.println(tmp);
    }
}
