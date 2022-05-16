//Created by Khanh Nguyen Van

package J05040;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NhanVien n = new NhanVien(i, in.nextLine(), Long.parseLong(in.nextLine()),
                    Long.parseLong(in.nextLine()), in.nextLine());
            a.add(n);
        }
        for (int i = 0; i < a.size(); i++) System.out.println(a.get(i));
    }
}
