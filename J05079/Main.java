package J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, ArrayList<HocPhan>> lhm = new LinkedHashMap<>();
        while (t-- > 0) {
            String s = in.nextLine();
            if (!lhm.containsKey(s)) lhm.put(s, new ArrayList<>());
            lhm.get(s).add(new HocPhan(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        int q = Integer.parseInt(in.nextLine());
        while (q-- > 0) {
            String s = in.nextLine();
            ArrayList<HocPhan> a = lhm.get(s);
            Collections.sort(a);
            System.out.println(a.get(0).getTen());
            for (HocPhan h : a) System.out.println(h);
        }
    }
}
