//Created by Khanhnvtb

package J07027;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine()));
        in.close();
        in = new Scanner(new File("BAITAP.in"));
        n = Integer.parseInt(in.nextLine());
        Map<Integer, String> m = new HashMap<>();
        for (int i = 1; i <= n; i++)
            m.put(i, in.nextLine());
        in.close();
        in = new Scanner(new File("NHOM.in"));
        while (in.hasNextLine()) {
            String str[] = in.nextLine().split(" ");
            for (SinhVien s : a) {
                if (s.getMa().equals(str[0])) {
                    int nhom = Integer.parseInt(str[1]);
                    s.setNhom(str[1] + " " + m.get(nhom));
                    break;
                }
            }
        }
        Collections.sort(a);
        for (SinhVien s : a)
            System.out.println(s);
    }
}
