//Created by Khanh Nguyen Van

package J04021;

import java.util.*;

public class IntSet {
    private SortedSet<Integer> ts = new TreeSet<>();

    public IntSet(int a[]) {
        for (int i = 0; i < a.length; i++)
            ts.add(a[i]);
    }

    public IntSet union(IntSet is) {
        for (Integer i : is.ts)
            this.ts.add(i);
        return this;
    }

    @Override
    public String toString() {
        String ans = "";
        for (Integer i : ts)
            ans += i + " ";
        return ans;
    }
}
