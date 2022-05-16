package J07009;

import java.util.ArrayList;
import java.util.Collections;

public class IntSet {
    private int a[] = new int[105];
    private ArrayList<Integer> arr = new ArrayList<>();

    public IntSet(int a[]) {
        this.a = a;
    }

    public IntSet(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public IntSet intersection(IntSet is) {
        int used[] = new int[1005];
        for (Integer i : this.a) used[i]++;
        for (Integer i : is.a)
            if (used[i] > 0) {
                arr.add(i);
                used[i] = 0;
            }
        Collections.sort(arr);
        return new IntSet(arr);
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < arr.size(); i++) ans += arr.get(i) + " ";
        return ans;
    }
}
