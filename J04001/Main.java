//Created by Khanh Nguyen Van

package J04001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            Point p1 = new Point();
            Point p2 = new Point();
            p1.Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            p2.Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            System.out.printf("%.4f", p1.distance(p2));
            System.out.println();
        }
    }
}
