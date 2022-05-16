package J07020;

public class HoaDon {
    private KhachHang khachHang;
    private MatHang matHang;
    private String maHD;
    private int soLuong, thanhTien;

    public HoaDon(int stt, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = "HD" + String.format("%03d", stt);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.thanhTien = tinhTien(matHang, soLuong);
    }

    private static int tinhTien(MatHang m, int soLuong) {
        return m.getGiaBan() * soLuong;
    }

    @Override
    public String toString() {
        return maHD + " " + khachHang + matHang + soLuong + " " + thanhTien;
    }
}
