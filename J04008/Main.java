//Created by Khanh Nguyen Van

package J04008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();
            p1.Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            p2.Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            p3.Point(Double.parseDouble(in.next()), Double.parseDouble(in.next()));
            if (p1.getY() == p2.getY() && p1.getY() == p3.getY() ||
                    p1.getX() == p2.getX() && p1.getX() == p3.getX())
                System.out.println("INVALID");
            else if ((p1.getX() - p2.getX()) / (p1.getY() - p2.getY()) ==
                    (p2.getX() - p3.getX()) / (p2.getY() - p3.getY())) System.out.println("INVALID");
            else {
                System.out.printf("%.3f", Point.perimeterOfTriangle(p1, p2, p3));
                System.out.println();
            }
        }
    }
}
