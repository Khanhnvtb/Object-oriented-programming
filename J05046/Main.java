//Created by Khanh Nguyen Van

package J05046;

import java.util.*;

public class Main {
    static LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

    public static String chuanHoa(String tenHang) {
        String s[] = tenHang.split(" ");
        String tmp = s[0].toUpperCase().charAt(0) + "" + s[1].toUpperCase().charAt(0);
        if (!lhm.containsKey(tmp)) lhm.put(tmp, 1);
        else lhm.put(tmp, lhm.get(tmp) + 1);
        return tmp + String.format("%02d", lhm.get(tmp));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<LoHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tenHang = in.nextLine();
            String maHang = chuanHoa(tenHang);
            int soLuong = Integer.parseInt(in.nextLine());
            int donGia = Integer.parseInt(in.nextLine());
            a.add(new LoHang(maHang, tenHang, soLuong, donGia));
        }
        for (LoHang l : a)
            System.out.println(l);
    }
}
