//Created by Khanh Nguyen Van

package J05049;

public class Hang implements Comparable<Hang> {
    private String ma;
    private int soLuongNhap, soLuongXuat, donGia, tien, thue;

    public Hang(String ma, int soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        this.soLuongXuat = timSoLuongXuat(ma, soLuongNhap);
        this.donGia = timDonGia(ma);
        this.tien = soLuongXuat * donGia;
        this.thue = tinhThue(ma);
    }

    public String getMa() {
        return ma;
    }

    private int tinhThue(String ma) {
        if (ma.charAt(0) == 'A' && ma.charAt(4) == 'Y') return tien / 100 * 8;
        else if (ma.charAt(0) == 'A' && ma.charAt(4) == 'N') return tien / 100 * 11;
        else if (ma.charAt(0) == 'B' && ma.charAt(4) == 'Y') return tien / 100 * 17;
        else return tien / 100 * 22;
    }

    private int timSoLuongXuat(String ma, int soLuongNhap) {
        if (ma.charAt(0) == 'A') return (soLuongNhap * 6 + 5) / 10;
        return (soLuongNhap * 7 + 5) / 10;
    }

    private int timDonGia(String ma) {
        if (ma.charAt(4) == 'Y') return 110000;
        return 135000;
    }

    public int compareTo(Hang h) {
        if (this.thue < h.thue) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }
}
