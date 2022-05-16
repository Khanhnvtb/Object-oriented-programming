//Created by Khanh Nguyen Van

package J05073;

public class DonHang {
    private String ma;
    private double gia;

    public DonHang(String ma, double gia, int soLuong) {
        this.ma = ma;
        this.gia = tinhGia(ma.charAt(0), ma.charAt(ma.length() - 1), gia);
    }

    private double tinhGia(char c1, char c2, double gia) {
        double res = gia;
        if (c1 == 'T') {
            if (c2 == 'C') return (res + res * (0.29 - 0.29 / 20 + 0.04)) * 1.2;
            else return (res + res * 0.33) * 1.2;
        } else if (c1 == 'C') {
            if (c2 == 'C') return (res + res * (0.1 - 0.1 / 20 + 0.03)) * 1.2;
            else return (res + res * 0.13) * 1.2;
        } else if (c1 == 'D') {
            if (c2 == 'C') return (res + res * (0.08 - 0.08 / 20 + 0.025)) * 1.2;
            else return (res + res * 0.105) * 1.2;
        } else {
            if (c2 == 'C') return (res + res * (0.02 - 0.02 / 20 + 0.005)) * 1.2;
            else return (res + res * 0.025) * 1.2;
        }
    }

    @Override
    public String toString() {
        return ma + " " + String.format("%.2f", gia);
    }
}
