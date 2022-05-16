//Created by Khanh Nguyen Van

package J05009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(new ThiSinh(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),
                    Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).getTongDiem() == a.get(i - 1).getTongDiem()) System.out.println(a.get(i));
        }
    }
}
