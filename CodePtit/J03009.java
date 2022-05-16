//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            String a[] = s.split(" ");
            s = in.nextLine();
            String b[] = s.split(" ");
            HashMap<String, Integer> hm = new HashMap<>();
            ArrayList<String> ds = new ArrayList<>();
            for (int i = 0; i < b.length; i++) hm.put(b[i], 1);
            for (int i = 0; i < a.length; i++)
                if (!hm.containsKey(a[i])) {
                    ds.add(a[i]);
                    hm.put(a[i], 1);
                }
            Collections.sort(ds);
            for (String str : ds)
                System.out.print(str + " ");
            System.out.println();
        }
    }
}
