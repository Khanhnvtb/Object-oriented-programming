package J07007;

import java.io.*;
import java.util.*;

public class WordSet {
    private SortedSet<String> ts;

    public WordSet(String s) throws IOException {
        Scanner in = new Scanner(new File(s));
        SortedSet<String> ts = new TreeSet<>();
        while (in.hasNext())
            ts.add(in.next().toLowerCase());
        this.ts = ts;
    }

    @Override
    public String toString() {
        String ans = "";
        for (String s : ts)
            ans += s + "\n";
        return ans;
    }
}
