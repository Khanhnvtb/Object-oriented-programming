//Created by Khanh Nguyen Van

package J05016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable <KhachHang>{
    private String ma, ten, soPhong;
    private long ngayO, thanhTien;
    Date d1, d2;

    public KhachHang(int stt, String ten, String soPhong, String ngayNhan, String ngayTra, int tienPhatSinh) {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.soPhong = soPhong;
        try {
            d1 = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
            d2 = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.ngayO = timSoNgay(d1, d2);
        this.thanhTien = tinhTien() + tienPhatSinh;
    }

    private long timSoNgay(Date d1, Date d2) {
        return ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)) % 365 + 1;
    }

    private long tinhTien() {
        int gia;
        if (soPhong.charAt(0) == '1') gia = 25;
        else if (soPhong.charAt(0) == '2') gia = 34;
        else if (soPhong.charAt(0) == '3') gia = 50;
        else gia = 80;
        return gia * ngayO;
    }

    public int compareTo(KhachHang k) {
        if (this.thanhTien < k.thanhTien) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soPhong + " " + ngayO + " " + thanhTien;
    }
}
