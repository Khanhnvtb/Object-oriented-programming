//Created by Khanhnvtb

package J07048;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        while (t-- > 0) a.add(new SanPham(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),
                Integer.parseInt(in.nextLine())));
        Collections.sort(a);
        for (SanPham s : a)
            System.out.println(s);
    }
}
