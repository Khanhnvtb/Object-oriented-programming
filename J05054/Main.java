//Created by Khanh Nguyen Van

package J05054;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<HocSinh> ds = new ArrayList<>();
        ArrayList<HocSinh> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            HocSinh h = new HocSinh(i, in.nextLine(), Double.parseDouble(in.nextLine()));
            ds.add(h);
            res.add(h);
        }
        Collections.sort(ds);
        for (HocSinh h : res) {
            System.out.print(h + " ");
            for (int i = 0; i < ds.size(); i++) {
                if (h.getDTB() == ds.get(i).getDTB()) {
                    int inDex = i;
                    while (inDex > 0 && ds.get(inDex).getDTB() == ds.get(inDex - 1).getDTB()) inDex--;
                    System.out.println(inDex + 1);
                    break;
                }
            }
        }
    }
}
