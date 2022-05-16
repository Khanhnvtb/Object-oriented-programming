//Created by Khanh Nguyen Van

package J05014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<GiaoVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new GiaoVien(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine())));
        }
        Collections.sort(a);
        for (GiaoVien g : a)
            System.out.println(g);
    }
}
