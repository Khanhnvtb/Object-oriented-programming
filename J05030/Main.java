//Created by Khanh Nguyen Van

package J05030;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(a);
        int i = 1;
        for (SinhVien s : a)
            System.out.println(i++ + " " + s);
    }
}
