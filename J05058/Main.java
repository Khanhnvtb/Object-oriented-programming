//Created by Khanh Nguyen Van

package J05058;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<HocSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new HocSinh(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(a);
        for (HocSinh h : a)
            System.out.println(h);
    }
}
