package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, gioiTinh, diaChi;
    private Date ngaySinh;

    public KhachHang(int stt, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", stt);
        this.ten = chuanHoaTen(ten.trim());
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaySinh);
    }

    private String chuanHoaTen(String ten) {
        String s[] = ten.toLowerCase().split("\\s+");
        String ans = "";
        for (String str : s) ans += str.toUpperCase().charAt(0) + str.substring(1) + " ";
        return ans;
    }

    public int compareTo(KhachHang k) {
        if (this.ngaySinh.compareTo(k.ngaySinh) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + gioiTinh + " " + diaChi + " " +
                new SimpleDateFormat("dd/mm/yyyy").format(ngaySinh);
    }
}
