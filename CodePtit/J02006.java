//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        SortedSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) ts.add(in.nextInt());
        for (int i = 0; i < m; i++) ts.add(in.nextInt());
        for (Integer i : ts)
            System.out.print(i + " ");
    }
}
