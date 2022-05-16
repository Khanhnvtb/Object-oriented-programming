//Created by Khanh Nguyen Van

package J05005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine())));
        }
        Collections.sort(a);
        for (SinhVien tmp : a)
            System.out.println(tmp);
    }
}
