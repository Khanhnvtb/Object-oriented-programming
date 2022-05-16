//Created by Khanh Nguyen Van

package J06001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, SanPham> lhm = new LinkedHashMap<>();
        while (n-- > 0) {
            String ma = in.nextLine();
            String ten = in.nextLine();
            lhm.put(ma + "1", new SanPham(ma, "1", ten, Long.parseLong(in.nextLine())));
            lhm.put(ma + "2", new SanPham(ma, "2", ten, Long.parseLong(in.nextLine())));
        }
        int t = Integer.parseInt(in.nextLine());
        ArrayList<HoaDon> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String s = in.next();
            long soLuong = in.nextLong();
            in.nextLine();
            SanPham sp = lhm.get(s);
            a.add(new HoaDon(i, sp.getMa(), sp.getTen(), sp.getGia(), soLuong));
        }
        for (HoaDon h : a)
            System.out.println(h);
    }
}
