//Created by Khanh Nguyen Van

package J05072;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<Integer, CuocGoi> lhm = new LinkedHashMap<>();
        while (n-- > 0) {
            int s = Integer.parseInt(in.nextLine());
            lhm.put(s, new CuocGoi(in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        ArrayList<CuocGoi> a = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            if (s.charAt(0) == '0') {
                int ma = Integer.parseInt(s.substring(1, 3));
                CuocGoi c = new CuocGoi();
                String str[] = s.split(" ");
                c.setSoDT(str[0]);
                c.setSoPhut('0', str[1] + " " + str[2]);
                c.setGiaCuoc(lhm.get(ma).getGiaCuoc());
                c.setPhaiTra('0');
                c.setTinh(lhm.get(ma).getTinh());
                a.add(c);
            } else {
                CuocGoi c = new CuocGoi();
                String str[] = s.split(" ");
                c.setSoDT(str[0]);
                c.setTinh("Noi mang");
                c.setSoPhut('1', str[1] + " " + str[2]);
                c.setPhaiTra('1');
                a.add(c);
            }
        }
        Collections.sort(a);
        for (CuocGoi c : a)
            System.out.println(c);
    }
}
