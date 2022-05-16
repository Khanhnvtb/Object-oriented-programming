//Created by Khanh Nguyen Van

package J05021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        while (in.hasNextLine()) {
            a.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (SinhVien tmp : a) {
            System.out.println(tmp);
        }
    }
}
