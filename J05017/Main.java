//Created by Khanh Nguyen Van

package J05017;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new KhachHang(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a);
        for (KhachHang k : a)
            System.out.println(k);
    }
}
