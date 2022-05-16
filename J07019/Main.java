package J07019;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(in.nextLine());
        Map<String, HoaDon> m = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            m.put(in.nextLine(), new HoaDon(in.nextLine(), Long.parseLong(in.nextLine()),
                    Long.parseLong(in.nextLine())));
        }
        in.close();
        in = new Scanner(new File("DATA2.in"));
        List<HoaDon> l = new ArrayList<>();
        n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            String ma = in.next();
            int soLuong = Integer.parseInt(in.nextLine().substring(1));
            HoaDon h = m.get(ma.substring(0, 2));
            h.tinhTien(i, soLuong, ma);
            System.out.println(h);
        }
        in.close();
    }
}

