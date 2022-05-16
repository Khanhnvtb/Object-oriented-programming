//Created by Khanhnvtb

package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Main {
    /*liệt kê cặp số 1
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) in.readObject();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        ArrayList<Pair> ds = new ArrayList<>();
        for (Pair p : a) {
            String s = p.getFirst() + " " + p.getSecond();
            if (p.getFirst() < p.getSecond() && !lhm.containsKey(s)) {
                ds.add(p);
                lhm.put(s, 1);
            }
        }
        Collections.sort(ds);
        for (Pair p : ds)
            System.out.println(p);
    }
    */

    /*liệt kê cặp số 2
    static int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) in.readObject();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        ArrayList<Pair> ds = new ArrayList<>();
        for (Pair p : a) {
            String s = p.getFirst() + " " + p.getSecond();
            if (p.getFirst() < p.getSecond() && !lhm.containsKey(s) && gcd(p.getFirst(), p.getSecond()) == 1) {
                ds.add(p);
                lhm.put(s, 1);
            }
        }
        Collections.sort(ds);
        for (Pair p : ds)
            System.out.println(p);
    }
     */
}
