package J07071;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static boolean cmp(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i += 2) {
            if (a.charAt(i) != '*' && a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Ten> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new Ten(in.nextLine()));
        }
        t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            ArrayList<Ten> ds = new ArrayList<>();
            for (Ten ten : a)
                if (cmp(s, ten.getVietTat())) ds.add(ten);
            Collections.sort(ds);
            for (Ten ten : ds)
                System.out.println(ten);
        }
    }
}
