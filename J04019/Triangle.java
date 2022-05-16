//Created by Khanh Nguyen Van

package J04019;

public class Triangle {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean valid() {
        if (p1.getY() == p2.getY() && p1.getY() == p3.getY() || p1.getX() == p2.getX() && p1.getX() == p3.getX())
            return false;
        if ((p1.getX() - p2.getX()) / (p1.getY() - p2.getY()) == (p2.getX() - p3.getX()) / (p2.getY() - p3.getY()))
            return false;
        return true;
    }

    public double getPerimeter() {
        return Math.round((p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) * 1000) /1000.0;
    }
}
