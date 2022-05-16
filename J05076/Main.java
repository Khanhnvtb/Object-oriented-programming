//Created by Khanh Nguyen Van

package J05076;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, Hang> lhm = new LinkedHashMap<>();
        while (n-- > 0)
            lhm.put(in.nextLine(), new Hang(in.nextLine(), in.nextLine().charAt(0)));
        n = Integer.parseInt(in.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while (n-- > 0) {
            String s[] = in.nextLine().split(" ");
            a.add(new MatHang(s[0], lhm.get(s[0]).getTen(), Integer.parseInt(s[1]) * Integer.parseInt(s[2]),
                    Integer.parseInt(s[2]) * Integer.parseInt(s[3]), lhm.get(s[0]).getLoai()));
        }
        for (MatHang m : a)
            System.out.println(m);
    }
}
