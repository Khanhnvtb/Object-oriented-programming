//Created by Khanh Nguyen Van

package J06003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Nhom> ds = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            ds.add(new Nhom(i));
        }
        in.nextLine();
        while (n-- > 0) {
            SinhVien s = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine());
            int nhom = Integer.parseInt(in.nextLine());
            ds.get(nhom - 1).getA().add(s);
        }
        for (int i = 1; i <= m; i++) {
            ds.get(i - 1).setDeTai(in.nextLine());
        }
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            int nhom = Integer.parseInt(in.nextLine());
            System.out.println(ds.get(nhom - 1));
        }
    }
}
