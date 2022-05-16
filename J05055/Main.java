//Created by Khanh Nguyen Van

package J05055;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<VanDongVien> ds = new ArrayList<>();
        ArrayList<VanDongVien> xh = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            VanDongVien v = new VanDongVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(v);
            xh.add(v);
        }
        Collections.sort(xh);
        for (VanDongVien v : ds) {
            System.out.print(v + " ");
            for (int i = 0; i < ds.size(); i++) {
                if (v.getThanhTichXepHang().compareTo(xh.get(i).getThanhTichXepHang()) == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
