//Created by Khanh Nguyen Van

package J04011;

public class Point3D {

    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static int scalarProduct(Point3D p1, Point3D p2) {
        return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
    }

    public static Point3D createVector(Point3D p1, Point3D p2) {
        Point3D p = new Point3D(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);
        return p;
    }

    public static Point3D vectorProduct(Point3D p1, Point3D p2) {
        Point3D p = new Point3D(p1.y * p2.z - p1.z * p2.y, p1.z * p2.x - p1.x * p2.z,
                p1.x * p2.y - p1.y * p2.x);
        return p;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D a = createVector(p1, p2);
        Point3D b = createVector(p1, p3);
        Point3D c = createVector(p1, p4);
        Point3D v = vectorProduct(a, b);
        if (scalarProduct(c, v) == 0) return true;
        return false;
    }
}
