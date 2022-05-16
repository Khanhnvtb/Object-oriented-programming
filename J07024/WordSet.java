//Created by Khanhnvtb

package J07024;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WordSet {
    private ArrayList<String> word = new ArrayList<>();

    public WordSet() {

    }

    public WordSet(String s) throws IOException {
        Scanner in = new Scanner(new File(s));
        while (in.hasNext()) word.add(in.next().toLowerCase());
    }

    public WordSet difference(WordSet w) {
        SortedSet<String> ts = new TreeSet<>();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
        for (String s : w.word)
            lhm.put(s, 1);
        for (String s : this.word)
            if (!lhm.containsKey(s)) ts.add(s);
        WordSet ans = new WordSet();
        for (String s : ts)
            ans.word.add(s);
        return ans;
    }

    @Override
    public String toString() {
        String ans = "";
        for (String s : word) {
            ans += s;
            ans += " ";
        }
        return ans;
    }
}
