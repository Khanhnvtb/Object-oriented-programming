//Created by Khanhnvtb

package File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        Map<String, Integer> m = new HashMap<>();
        ArrayList<String> ds = new ArrayList<>();
        for (String s : a) {
            String tmp[] = s.toLowerCase().split("\\W+");
            for (String word : tmp) {
                if (!word.equals(""))
                    if (m.containsKey(word)) m.put(word, m.get(word) + 1);
                    else {
                        m.put(word, 1);
                        ds.add(word);
                    }
            }
        }
        Collections.sort(ds, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (m.get(o1) < m.get(o2)) return 1;
                else if (m.get(o1) == m.get(o2) && o1.compareTo(o2) > 0) return 1;
                return -1;
            }
        });
        for (String i : ds)
            System.out.println(i + " " + m.get(i));
    }
}