//Created by Khanh Nguyen Van

package J05077;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, PhongBan> lhm = new LinkedHashMap<>();
        while (n-- > 0) {
            String s = in.nextLine();
            lhm.put(s.substring(0, 2), new PhongBan(s.substring(0, 2), s.substring(3)));
        }
        n = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> a = new ArrayList<>();
        while (n-- > 0) {
            String s = in.nextLine();
            String ma = s.charAt(3) + "" + s.charAt(4);
            int nam = Integer.parseInt(s.charAt(1) + "" + s.charAt(2));
            char loai = s.charAt(0);
            a.add(new NhanVien(s, in.nextLine(), lhm.get(ma).getTen(), Integer.parseInt(in.nextLine()),
                    Integer.parseInt(in.nextLine()), loai, nam));
        }
        for (NhanVien nv : a)
            System.out.println(nv);
    }
}
