//Created by Khanh Nguyen Van

package J05020;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (SinhVien tmp : a) {
            System.out.println(tmp);
        }
    }
}
