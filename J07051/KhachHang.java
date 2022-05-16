package J07051;

import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, soPhong;
    private long soNgay, thanhTien;

    public KhachHang(int stt, String ten, String soPhong, String ngayDen, String ngayDi, int phatSinh) throws Exception {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = chuanHoa(ten.trim());
        this.soPhong = soPhong;
        Date den = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        Date di = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.soNgay = (di.getTime() - den.getTime()) / 86400000 + 1;
        this.thanhTien = tinhTien(soPhong.charAt(0), soNgay) + phatSinh;
    }

    private String chuanHoa(String ten) {
        String s[] = ten.split("\\s+");
        String ans = "";
        for (String str : s) {
            ans += str.toUpperCase().charAt(0);
            ans += str.toLowerCase().substring(1) + " ";
        }
        return ans;
    }

    private long tinhTien(char c, long soNgay) {
        if (c == '1') return soNgay * 25;
        else if (c == '2') return soNgay * 34;
        else if (c == '3') return soNgay * 50;
        return soNgay * 80;
    }

    public int compareTo(KhachHang k) {
        if (this.thanhTien <= k.thanhTien) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + soPhong + " " + soNgay + " " + thanhTien;
    }
}
