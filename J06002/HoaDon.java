//Created by Khanh Nguyen Van

package J06002;

public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten;
    private long giamGia, phaiTra;

    public HoaDon(int stt, String ma, String ten, long gia, long soLuong) {
        this.ma = ma + "-" + String.format("%03d", stt);
        this.ten = ten;
        long tien = soLuong * gia;
        this.giamGia = tinhGiamGia(soLuong, tien);
        this.phaiTra = tien - giamGia;
    }

    private long tinhGiamGia(long soLuong, long tien) {
        if (soLuong >= 150) return tien / 2;
        else if (soLuong >= 100) return tien / 10 * 3;
        else if (soLuong >= 50) return tien / 100 * 15;
        return 0;
    }

    public int compareTo(HoaDon h) {
        if (this.phaiTra <= h.phaiTra) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + giamGia + " " + phaiTra;
    }
}
