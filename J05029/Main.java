//Created by Khanh Nguyen Van

package J05029;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThucTapSinh> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new ThucTapSinh(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a);
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + l + "  DEN " + r + " SINH VIEN:");
            for (ThucTapSinh t : a)
                if (t.getSoLuong() >= l && t.getSoLuong() <= r)
                    System.out.println(t);
        }
    }
}
