//Created by Khanhnvtb

package J07028;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0)
            in.nextLine();
        in.close();
        in = new Scanner(new File("GIANGVIEN.in"));
        ArrayList<GiangVien> a = new ArrayList<>();
        n = Integer.parseInt(in.nextLine());
        while (n-- > 0)
            a.add(new GiangVien(in.nextLine()));
        in.close();
        in = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String str[] = in.nextLine().split(" ");
            for (GiangVien g : a)
                if (str[0].equals(g.getMa())) {
                    g.setGioChuan(Double.parseDouble(str[2]));
                    break;
                }
        }
        in.close();
        for (GiangVien g : a)
            System.out.println(g);
    }
}
