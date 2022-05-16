//Created by Khanh Nguyen Van

package J05008;

public class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    private static double perimeterOfTriangle(Point p1, Point p2, Point p3) {
        return distance(p1, p2) + distance(p2, p3) + distance(p1, p3);
    }

    public static double areaOfTriangle(Point p1, Point p2, Point p3) {
        double h = perimeterOfTriangle(p1, p2, p3) / 2;
        return Math.sqrt(h * (h - distance(p1, p2)) * (h - distance(p2, p3)) * (h - distance(p1, p3)));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
