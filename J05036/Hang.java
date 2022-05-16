//Created by Khanh Nguyen Van

package J05036;

public class Hang {
    private String ma, ten, donVi;
    private long phiVanChuyen, thanhTien, giaBan;

    public Hang(int stt, String ten, String donVi, long donGiaNhap, long soLuong) {
        this.ma = "MH" + String.format("%02d", stt);
        this.ten = ten;
        this.donVi = donVi;
        this.phiVanChuyen = Math.round((double) donGiaNhap * soLuong / 20);
        this.thanhTien = donGiaNhap * soLuong + phiVanChuyen;
        this.giaBan = thanhTien + Math.round((double) thanhTien / 50);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBan;
    }
}
