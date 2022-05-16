package File;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07080 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a1 = (ArrayList<String>) in.readObject();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) in.readObject();
        SortedSet<String> ts = new TreeSet<>();
        for (String s1 : a1)
            for (Integer s2 : a2)
                ts.add(s1 + s2);
        for (String s : ts)
            System.out.println(s);
    }
}