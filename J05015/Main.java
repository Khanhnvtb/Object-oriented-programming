//Created by Khanh Nguyen Van

package J05015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<CuaRo> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new CuaRo(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(a);
        for (CuaRo c : a)
            System.out.println(c);
    }
}
