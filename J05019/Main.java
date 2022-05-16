//Created by Khanh Nguyen Van

package J05019;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<TramDo> a = new ArrayList<>();
        HashMap<String, Integer> lhm = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            TramDo t = new TramDo(a.size() + 1, in.nextLine(), in.nextLine(), in.nextLine(),
                    Double.parseDouble(in.nextLine()));
            if (!lhm.containsKey(t.getTen())) {
                a.add(t);
                lhm.put(t.getTen(), 1);
            } else {
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(j).getTen().equals(t.getTen())) {
                        a.get(j).setPhut(a.get(j).getPhut() + t.getPhut());
                        a.get(j).setLuongMua(a.get(j).getLuongMua() + t.getLuongMua());
                        break;
                    }
                }
            }
        }
        for (TramDo t : a)
            System.out.println(t + " " + String.format("%.2f", TramDo.tinhLuongMuaTrungBinh
                    (t.getPhut(), t.getLuongMua())));
    }
}
