package J07019;

public class HoaDon {
    private String ma, ten;
    private long giaLoai1, giaLoai2, giamGia, phaiTra;

    public HoaDon(String ten, long giaLoai1, long giaLoai2) {
        this.ten = ten;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    private long tinhGiamGia(long soLuong, long tien) {
        if (soLuong >= 150) return tien / 2;
        else if (soLuong >= 100) return tien / 10 * 3;
        else if (soLuong >= 50) return tien / 100 * 15;
        return 0;
    }

    public void tinhTien(int stt, long soLuong, String ma) {
        long tien;
        this.ma = ma + "-" + String.format("%03d", stt);
        if (ma.charAt(2) == '1') tien = soLuong * giaLoai1;
        else tien = soLuong * giaLoai2;
        this.giamGia = tinhGiamGia(soLuong, tien);
        this.phaiTra = tien - giamGia;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + giamGia + " " + phaiTra;
    }
}
