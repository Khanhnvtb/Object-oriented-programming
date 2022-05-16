//Created by Khanh Nguyen Van

package J04010;

public class Point {
    private double x, y;

    public Point() {

    }

    public void Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
