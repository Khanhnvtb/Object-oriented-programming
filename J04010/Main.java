//Created by Khanh Nguyen Van

package J04010;

import java.util.*;

public class Main {
    public static double areaOfTriangle(double h, double a, double b, double c) {
        return Math.sqrt(h * (h - a) * (h - b) * (h - c));
    }

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
                double a = Point.distance(p1, p2);
                double b = Point.distance(p2, p3);
                double c = Point.distance(p1, p3);
                double h = (a + b + c) / 2;
                double R = a * b * c / (4 * areaOfTriangle(h, a, b, c));
                System.out.printf("%.3f", Math.PI * R * R);
                System.out.println();
            }
        }
    }
}
