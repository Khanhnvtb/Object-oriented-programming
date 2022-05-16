//Created by Khanh Nguyen Van

package J05056;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<VanDongVien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ds.add(new VanDongVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds);
        for (int i = 0; i < ds.size(); i++) {
            int inDex = i;
            while (inDex > 0 && ds.get(inDex).getThanhTichXepHang().compareTo
                    (ds.get(inDex - 1).getThanhTichXepHang()) == 0) inDex--;
            System.out.println(ds.get(i) + " " + (inDex + 1));
        }
    }
}
