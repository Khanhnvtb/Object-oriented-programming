//Created by Khanh Nguyen Van

package J05073;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<DonHang> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new DonHang(in.next(), in.nextDouble(), in.nextInt()));
        }
        for (DonHang d : a)
            System.out.println(d);
    }
}
