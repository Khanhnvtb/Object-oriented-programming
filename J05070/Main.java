//Created by Khanh Nguyen Van

package J05070;

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
        ArrayList<TranDau> a = new ArrayList<>();
        while (n-- > 0) {
            String ma = in.nextLine();
            String s = ma.substring(1, 3);
            lhm.get(s).setMa(ma.substring(0, 4));
            lhm.get(s).setDoanhThu(Integer.parseInt(ma.substring(5)));
            a.add(lhm.get(s));
        }
        Collections.sort(a);
        for (TranDau t : a)
            System.out.println(t);
    }
}
