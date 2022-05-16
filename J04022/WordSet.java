package J04022;

import java.util.*;

public class WordSet {
    private ArrayList<String> word = new ArrayList<>();

    public WordSet() {
    }

    public WordSet(String s) {
        String str[] = s.toLowerCase().split(" ");
        for (int i = 0; i < str.length; i++) word.add(str[i]);
    }

    public WordSet union(WordSet w) {
        SortedSet<String> ts = new TreeSet<>();
        for (String s : this.word)
            ts.add(s);
        for (String s : w.word)
            ts.add(s);
        WordSet ans = new WordSet();
        for (String s : ts)
            ans.word.add(s);
        return ans;
    }

    public WordSet intersection(WordSet w) {
        SortedSet<String> ts = new TreeSet<>();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
        for (String s : this.word)
            lhm.put(s, 1);
        for (String s : w.word)
            if (lhm.containsKey(s)) ts.add(s);
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
