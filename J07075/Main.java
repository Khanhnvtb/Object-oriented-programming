package J07075;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        HashMap<String, MonHoc> mon = new HashMap<>();
        while (t-- > 0) {
            String s = in.nextLine();
            mon.put(s, new MonHoc(s, in.nextLine(), in.nextLine()));
        }
        in = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<LichGD> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String s = in.nextLine();
            a.add(new LichGD(i, mon.get(s), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        String s = in.nextLine();
        List<LichGD> ds = new LinkedList<>();
        for (LichGD l : a)
            if (l.getGv().equals(s))
                ds.add(l);
        Collections.sort(ds);
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for (LichGD l : ds)
            System.out.println(l);
    }
}
