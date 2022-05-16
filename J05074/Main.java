//Created by Khanh Nguyen Van

package J05074;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < t; i++)
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), 10));
        for (int i = 0; i < t; i++) {
            String ma = in.next();
            for (SinhVien s : a) {
                if (s.getMa().equals(ma)) {
                    s.tinhDiem(in.nextLine());
                    break;
                }
            }
        }
        for (SinhVien s : a) System.out.println(s);
    }
}

