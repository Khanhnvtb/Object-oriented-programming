package J07060;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONTHI.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MonThi> mon = new ArrayList<>();
        while (t-- > 0)
            mon.add(new MonThi(in.nextLine(), in.nextLine(), in.nextLine()));
        in = new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<CaThi> ca = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            ca.add(new CaThi(i, in.nextLine(), in.nextLine(), in.nextLine()));
        in = new Scanner(new File("LICHTHI.in"));
        ArrayList<LichThi> ds = new ArrayList<>();
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String str[] = in.nextLine().split(" ");
            MonThi monThi = null;
            CaThi caThi = null;
            for (MonThi m : mon)
                if (m.getMa().equals(str[1])) {
                    monThi = m;
                    break;
                }
            for (CaThi c : ca)
                if (c.getMa().equals(str[0])) {
                    caThi = c;
                    break;
                }
            ds.add(new LichThi(monThi, caThi, Integer.parseInt(str[2]), str[3]));
        }
        Collections.sort(ds);
        for (LichThi l : ds)
            System.out.println(l);
    }
}
