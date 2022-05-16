package File;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07061 {
    static boolean laSoKhongGiam(String s) {
        if (s.length() < 2) return false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        SortedSet<Integer> st = new TreeSet<>();
        int us1[] = new int[10005];
        int us2[] = new int[10005];
        for (Integer i : a) {
            if (laSoKhongGiam(i.toString())) us1[i]++;
        }
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a = (ArrayList<Integer>) in.readObject();
        for (Integer i : a) {
            if (us1[i] != 0) {
                us2[i]++;
                st.add(i);
            }
        }
        for (Integer i : st) {
            System.out.println(i + " " + us1[i] + " " + us2[i]);
        }
    }
}
