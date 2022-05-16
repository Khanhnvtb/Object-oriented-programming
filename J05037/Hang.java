//Created by Khanh Nguyen Van

package J05037;

public class Hang implements Comparable<Hang> {
    private String ma, ten, donVi;
    private long phiVanChuyen, thanhTien, giaBanLe;

    public Hang(int stt, String ten, String donVi, long donGiaNhap, long soLuong) {
        this.ma = "MH" + String.format("%02d", stt);
        this.ten = ten;
        this.donVi = donVi;
        this.phiVanChuyen = Math.round((double) donGiaNhap * soLuong / 20);
        this.thanhTien = donGiaNhap * soLuong + phiVanChuyen;
        long tien = Math.round((double) thanhTien / 100 * 102 / soLuong);
        if (tien % 100 != 0) this.giaBanLe = (tien / 100 + 1) * 100;
        else this.giaBanLe = tien;
    }

    public int compareTo(Hang h) {
        if (this.giaBanLe < h.giaBanLe) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + phiVanChuyen + " " + thanhTien + " " + giaBanLe;
    }
}
