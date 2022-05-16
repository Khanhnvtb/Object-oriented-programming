//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        while (t-- > 0) {
            String s = in.nextLine().trim();
            String[] word = s.split("\\s+");
            int len = word.length - 1;
            String res = new String();
            for (int i = 0; i < word[len].length(); i++)
                res += word[len].toLowerCase().charAt(i);
            for (int i = 0; i < word.length - 1; i++)
                if (word[i].length() > 0)
                    res += word[i].toLowerCase().charAt(0);
            if (!lhm.containsKey(res)) lhm.put(res, 1);
            else lhm.put(res, lhm.get(res) + 1);
            System.out.print(res);
            if (lhm.get(res) > 1) System.out.print(lhm.get(res));
            System.out.println("@ptit.edu.vn");
        }
    }
}
