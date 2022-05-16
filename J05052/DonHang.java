//Created by Khanh Nguyen Van

package J05052;

public class DonHang {
    private String donHang, maDonHang, stt;
    private int giamGia, thanhTien;

    public DonHang(String donHang, String maDonHang, int donGia, int soLuong) {
        this.donHang = donHang;
        this.maDonHang = maDonHang;
        this.stt = maDonHang.charAt(1) + "" + maDonHang.charAt(2) + "" + maDonHang.charAt(3);
        this.giamGia = tinhGiamGia(maDonHang.charAt(4), donGia, soLuong);
        this.thanhTien = soLuong * donGia - giamGia;
    }

    private int tinhGiamGia(char c, int donGia, int soLuong) {
        if (c == '2') return donGia / 10 * 3 * soLuong;
        return donGia / 2 * soLuong;
    }

    @Override
    public String toString() {
        return donHang + " " + " " + maDonHang + " " + stt + " " + giamGia + " " + thanhTien;
    }
}
