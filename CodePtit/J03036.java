//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03036 {
    static class rotaArray {
        private ArrayList<Integer> a;

        public rotaArray(int rota) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(rota);
            this.a = a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String str[] = new String[n];
        for (int i = 0; i < n; i++) str[i] = in.nextLine();
        LinkedHashMap<String, rotaArray> lhm = new LinkedHashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str[0].length(); i++) {
            String tmp = str[0].substring(i) + str[0].substring(0, i);
            if (!lhm.containsKey(tmp)) lhm.put(tmp, new rotaArray(i));
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                String tmp = str[i].substring(j) + str[i].substring(0, j);
                if (!lhm.containsKey(tmp)) {
                    res = -1;
                    break;
                } else {
                    if (lhm.get(tmp).a.size() == i) lhm.get(tmp).a.add(j);
                    else if (lhm.get(tmp).a.size() < i) lhm.remove(tmp);
                }
            }
            if (res == -1) break;
        }
        if (res == -1) System.out.println(res);
        else {
            for (String s : lhm.keySet()) {
                if (lhm.get(s).a.size() == n) {
                    int val = 0;
                    ArrayList<Integer> a = lhm.get(s).a;
                    for (int i = 0; i < a.size(); i++) val += a.get(i);
                    res = Math.min(res, val);
                }
            }
            System.out.println(res);
        }
    }
}
