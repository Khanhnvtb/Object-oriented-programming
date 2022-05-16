//Created by Khanh Nguyen Van

package J05069;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int clb = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, TranDau> lhm = new LinkedHashMap<>();
        while (clb-- > 0) {
            String ma = in.nextLine();
            lhm.put(ma, new TranDau(in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        int n = Integer.parseInt(in.nextLine());
        List<TranDau> l = new ArrayList<>();
        while (n-- > 0) {
            String ma = in.nextLine();
            String s = ma.substring(1, 3);
            lhm.get(s).setMa(ma.substring(0, 4));
            lhm.get(s).setDoanhThu(Integer.parseInt(ma.substring(5)));
            l.add(lhm.get(s));
        }
        for (TranDau t : l)
            System.out.println(t);
    }
}
