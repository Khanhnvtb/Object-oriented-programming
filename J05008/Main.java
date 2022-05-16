//Created by Khanh Nguyen Van

package J05008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.nextLine());
            ArrayList<Point> a = new ArrayList<>();
            for (int i = 0; i < n; i++)
                a.add(new Point(Double.parseDouble(in.next()), Double.parseDouble(in.nextLine())));
            double ans = 0;
            for (int i = 1; i < n - 1; i++)
                ans += Point.areaOfTriangle(a.get(0), a.get(i), a.get(i + 1));
            System.out.printf("%.3f", ans);
            System.out.println();
        }
    }
}
