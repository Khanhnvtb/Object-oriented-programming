//Created by Khanh Nguyen Van

package J05046;

public class LoHang {
    private String maHang, tenHang;
    private int tienChietKhau, thanhTien;

    public LoHang(String maHang, String tenHang, int soLuong, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.tienChietKhau = tinhChietKhau(soLuong, donGia);
        this.thanhTien = tinhTien(tienChietKhau, soLuong, donGia);
    }

    private int tinhChietKhau(int soLuong, int donGia) {
        if (soLuong > 10) return donGia * soLuong / 20;
        else if (soLuong > 7) return donGia * soLuong / 50;
        else if (soLuong > 4) return donGia * soLuong / 100;
        return 0;
    }

    private int tinhTien(int tienChietKhau, int soLuong, int donGia) {
        return soLuong * donGia - tienChietKhau;
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + tienChietKhau + " " + thanhTien;
    }
}
