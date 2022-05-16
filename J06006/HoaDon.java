//Created by Khanh Nguyen Van

package J06006;

public class HoaDon implements Comparable<HoaDon> {
    private KhachHang khachHang;
    private MatHang matHang;
    private String maHD;
    private int soLuong;
    private long thanhTien, loiNhuan;

    public HoaDon(int stt, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = "HD" + String.format("%03d", stt);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.thanhTien = matHang.getGiaBan() * soLuong;
        this.loiNhuan = thanhTien - matHang.getGiaMua() * soLuong;
    }

    public int compareTo(HoaDon h) {
        if (this.loiNhuan <= h.loiNhuan) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return maHD + " " + khachHang + matHang + soLuong + " " + thanhTien + " " + loiNhuan;
    }
}
