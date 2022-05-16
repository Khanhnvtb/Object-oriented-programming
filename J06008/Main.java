//Created by Khanh Nguyen Van

package J06008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        while (n-- > 0) {
            lhm.put(in.next(), in.nextLine().substring(1));
        }
        n = Integer.parseInt(in.nextLine());
        ArrayList<GiangVien> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new GiangVien(in.next(), in.nextLine().substring(1)));
        n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String str[] = in.nextLine().split(" ");
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getMa().equals(str[0])) {
                    a.get(i).themGio(lhm.get(str[1]), Double.parseDouble(str[2]));
                    break;
                }
            }
        }
        String gv = in.nextLine();
        for (GiangVien g : a)
            if (g.getMa().equals(gv)) {
                System.out.println(g);
                LinkedHashMap<String, Double> ans = g.getDs();
                for (String s : ans.keySet())
                    System.out.println(s + " " + ans.get(s));
                System.out.println("Tong: " + String.format("%.2f", g.tinhTongSoGio()));
            }
    }
}
