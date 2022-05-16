//Created by Khanhnvtb

package J07047;

public class LoaiPhong{
    private String ma, ten;
    private double gia, phi;

    public LoaiPhong(String s) {
        String str[] = s.split(" ");
        this.ma = str[0];
        this.ten = str[1];
        this.gia = Double.parseDouble(str[2]);
        this.phi = Double.parseDouble(str[3]);
    }

    public String getMa() {
        return ma;
    }

    public double getGia() {
        return gia;
    }

    public double getPhi() {
        return phi;
    }
}
