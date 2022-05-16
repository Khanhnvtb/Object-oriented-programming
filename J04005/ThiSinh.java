//Created by Khanh Nguyen Van

package J04005;

public class ThiSinh {
    private String full_name, date_of_bith;
    private double point1, point2, point3, sum_point;

    public ThiSinh(String full_name, String date_of_bith, double point1, double point2, double point3) {
        this.full_name = full_name;
        this.date_of_bith = date_of_bith;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.sum_point = this.point1 + this.point2 + this.point3;
    }

    @Override
    public String toString() {
        return this.full_name + " " + this.date_of_bith + " " + String.format("%.1f", this.sum_point);
    }
}
