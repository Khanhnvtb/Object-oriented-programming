//Created by Khanh Nguyen Van

package J06007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, MonHoc> lhm = new LinkedHashMap<>();
        ArrayList<GiangVien> a = new ArrayList<>();
        while (n-- > 0) {
            String ma = in.next();
            lhm.put(ma, new MonHoc(ma, in.nextLine().substring(1)));
        }
        n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String s = in.nextLine();
            a.add(new GiangVien(s.substring(0, 4), s.substring(5)));
        }
        n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String str[] = in.nextLine().split(" ");
            for (GiangVien gv : a)
                if (gv.getMa().equals(str[0])) {
                    gv.setSoGio(Double.parseDouble(str[2]));
                    break;
                }
        }
        for (GiangVien gv : a) {
            System.out.println(gv);
        }
    }
}
