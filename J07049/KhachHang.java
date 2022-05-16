//Created by Khanhnvtb

package J07049;

public class KhachHang {
    private String ma, ten, diaChi, maSanPham, ngayMua;
    private int soLuong;

    public KhachHang(int stt, String ten, String diaChi, String maSanPham, int soLuong, String ngayMua) {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.diaChi = diaChi;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
    }

    public String getMa() {
        return ma;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diaChi + " " + maSanPham;
    }
}
