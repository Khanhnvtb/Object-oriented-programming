//Created by Khanh Nguyen Van

package J05067;

public class DonHang {
    private String ma, hang;
    private long donGia, thue, thanhTien;

    public DonHang(String ma, int soLuong) {
        this.ma = ma;
        this.hang = timHang(ma.charAt(3));
        this.donGia = tinhDonGia(ma.charAt(0));
        long tien = soLuong * donGia;
        this.thue = tinhThue(ma, tien);
        this.thanhTien = tien + thue;
    }

    private String timHang(char c) {
        if (c == 'B') return "British Petro";
        else if (c == 'E') return "Esso";
        else if (c == 'S') return "Shell";
        else if (c == 'C') return "Castrol";
        else if (c == 'T') return "Trong Nuoc";
        return "Mobil";
    }

    private int tinhDonGia(char c) {
        if (c == 'X') return 128000;
        else if (c == 'D') return 11200;
        return 9700;
    }

    private long tinhThue(String ma, long tien) {
        if (ma.charAt(3) == 'T') return 0;
        if (ma.charAt(0) == 'X') return tien / 100 * 3;
        else if (ma.charAt(0) == 'D') return tien / 100 * 7 / 2;
        return tien / 50;
    }

    @Override
    public String toString() {
        return ma + " " + hang + " " + donGia + " " + thue + " " + thanhTien;
    }
}
