//Created by Khanhnvtb

package File;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class J07023 {
    static boolean isReversible(String n) {
        int l = 0, r = n.length() - 1;
        while (l < r) {
            if (n.charAt(l++) != n.charAt(r--)) return false;
        }
        return true;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        ArrayList<Integer> ds = new ArrayList<>();
        for (Integer i : a) {
            if (m1.containsKey(i)) m1.put(i, m1.get(i) + 1);
            else {
                if (isReversible(String.valueOf(i)) && isPrime(i)) m1.put(i, 1);
            }
        }
        in.close();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a = (ArrayList<Integer>) in.readObject();
        for (Integer i : a) {
            if (m1.containsKey(i)) {
                if (m2.containsKey(i)) m2.put(i, m2.get(i) + 1);
                else {
                    m2.put(i, 1);
                    ds.add(i);
                }
            }
        }
        Collections.sort(ds);
        for (Integer i : ds)
            System.out.println(i + " " + m1.get(i) + " " + m2.get(i));
    }
}
