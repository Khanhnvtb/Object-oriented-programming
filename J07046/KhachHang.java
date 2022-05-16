//Created by Khanhnvtb

package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, maPhong;
    private long SoNgay;

    public KhachHang(int stt, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.maPhong = maPhong;
        Date den = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        Date di = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.SoNgay = ((di.getTime() - den.getTime()) / (1000 * 60 * 60 * 24)) % 365;
    }

    public int compareTo(KhachHang k) {
        if (this.SoNgay <= k.SoNgay) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + SoNgay;
    }
}
