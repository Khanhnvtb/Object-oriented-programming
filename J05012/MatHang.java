//Created by Khanh Nguyen Van

package J05012;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten;
    private int soLuong, chietKhau;
    private long donGia, tongTien;

    public MatHang(String ma, String ten, int soLuong, long donGia, int chietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.tongTien = donGia * soLuong - chietKhau;
    }

    public int compareTo(MatHang m) {
        if (this.tongTien < m.tongTien) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien;
    }
}