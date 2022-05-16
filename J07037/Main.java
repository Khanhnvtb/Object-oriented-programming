//Created by Khanhnvtb

package J07037;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new DoanhNghiep(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (DoanhNghiep d : a)
            System.out.println(d);
    }
}
