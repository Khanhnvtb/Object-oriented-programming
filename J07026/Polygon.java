//Created by Khanhnvtb

package J07026;

public class Polygon {
    private Point p[];

    public Polygon(Point[] p) {
        this.p = p;
    }

    private static double area(Point p1, Point p2, Point p3) {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double h = (a + b + c) / 2;
        return Math.sqrt(h * (h - a) * (h - b) * (h - c));
    }

    public String getArea() {
        double ans = 0;
        for (int i = 1; i < p.length - 1; i++) {
            ans += area(p[0], p[i], p[i + 1]);
        }
        return String.format("%.3f", ans);
    }
}
