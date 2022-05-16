//Created by Khanh Nguyen Van

package J05063;

import java.util.*;

public class DaThuc {
    private ArrayList<SoHang> a = new ArrayList<>();

    public DaThuc() {

    }

    public DaThuc(String s) {
        StringTokenizer st = new StringTokenizer(s, "*x^ + ");
        ArrayList<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<SoHang> a = new ArrayList<>();
        for (int i = 0; i < arr.size(); i += 2)
            a.add(new SoHang(arr.get(i), arr.get(i + 1)));
        this.a = a;
    }

    public DaThuc cong(DaThuc d) {
        DaThuc res = new DaThuc();
        int inDex1 = 0, inDex2 = 0;
        while (inDex1 < this.a.size() && inDex2 < d.a.size()) {
            if (this.a.get(inDex1).getBac() == d.a.get(inDex2).getBac()) {
                res.a.add(new SoHang(this.a.get(inDex1).getHeSo() + d.a.get(inDex2).getHeSo(),
                        d.a.get(inDex2).getBac()));
                inDex1++;
                inDex2++;
            } else if (this.a.get(inDex1).getBac() > d.a.get(inDex2).getBac()) res.a.add(this.a.get(inDex1++));
            else res.a.add(d.a.get(inDex2++));
        }
        while (inDex1 < this.a.size()) res.a.add(this.a.get(inDex1++));
        while (inDex2 < d.a.size()) res.a.add(d.a.get(inDex2++));
        Collections.sort(res.a);
        return res;
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < a.size() - 1; i++) ans += a.get(i) + " + ";
        ans += a.get(a.size() - 1);
        return ans;
    }
}
