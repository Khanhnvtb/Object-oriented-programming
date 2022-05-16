//Created by Khanh Nguyen Van

package J05062;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int slot = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        ArrayList<Double> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien s = new SinhVien(in.nextLine(), in.nextLine());
            ds.add(s);
            a.add(s.getGpa());
        }
        Collections.sort(a, Collections.reverseOrder());
        double diemHB;
        if (slot >= n) diemHB = a.get(a.size() - 1);
        else diemHB = a.get(slot - 1);
        for (SinhVien s : ds) {
            if (s.getGpa() >= diemHB) System.out.println(s + s.getXepLoai());
            else System.out.println(s + "KHONG");
        }
    }
}
