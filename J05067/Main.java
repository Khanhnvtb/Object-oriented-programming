//Created by Khanh Nguyen Van

package J05067;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<DonHang> a = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            a.add(new DonHang(in.next(), in.nextInt()));
            in.nextLine();
        }
        for (DonHang d : a)
            System.out.println(d);
    }
}
