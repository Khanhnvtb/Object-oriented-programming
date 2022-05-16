//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) hm.put(in.nextInt(), 1);
        for (int i = 0; i < m; i++) {
            int val = in.nextInt();
            if (hm.containsKey(val)) {
                a.add(val);
                hm.remove(val);
            }
        }
        Collections.sort(a);
        for (Integer i : a)
            System.out.print(i + " ");
    }
}
