//Created by Khanhnvtb

package J07047;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private String ma, ten, maPhong;
    private int SoNgay;

    public KhachHang(int stt, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.maPhong = maPhong;
        Date den = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        Date di = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.SoNgay = (int) ((di.getTime() - den.getTime()) / (1000 * 60 * 60 * 24)) % 365;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + SoNgay;
    }
}
