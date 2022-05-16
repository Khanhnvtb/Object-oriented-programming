//Created by Khanh Nguyen Van

package J05025;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            a.add(new GiangVien(i, in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (GiangVien g : a) {
            System.out.println(g);
        }
    }
}
