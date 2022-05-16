//Created by Khanh Nguyen Van

package J05028;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThucTapSinh> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(new ThucTapSinh(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a);
        for (ThucTapSinh t : a)
            System.out.println(t);
    }
}
