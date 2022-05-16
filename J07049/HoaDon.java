//Created by Khanhnvtb

package J07049;

public class HoaDon implements Comparable<HoaDon> {
    private KhachHang k;
    private SanPham s;
    private int phaiTra;
    private String baoHanh;

    public HoaDon(KhachHang k, SanPham s) {
        this.k = k;
        this.s = s;
        this.phaiTra = k.getSoLuong() * s.getGia();
        this.baoHanh = tinhBaoHanh(k.getNgayMua(), s.getBaoHanh());
    }

    private String tinhBaoHanh(String ngayMua, int baoHanh) {
        String str[] = ngayMua.split("/");
        int ngay = Integer.parseInt(str[0]);
        int thang = Integer.parseInt(str[1]) + baoHanh;
        int nam;
        if (thang % 12 == 0) {
            nam = Integer.parseInt(str[2]) + thang / 12 - 1;
            thang = 12;
        } else {
            nam = Integer.parseInt(str[2]) + thang / 12;
            thang %= 12;
        }
        return String.format("%02d/%02d/%02d", ngay, thang, nam);
    }

    public int compareTo(HoaDon h) {
        String str1[] = this.baoHanh.split("/");
        String str2[] = h.baoHanh.split("/");
        if (str1[2].compareTo(str2[2]) > 0) return 1;
        else if (str1[2].compareTo(str2[2]) == 0 && str1[1].compareTo(str2[1]) > 0) return 1;
        else if (str1[2].compareTo(str2[2]) == 0 && str1[1].compareTo(str2[1]) == 0 &&
                str1[0].compareTo(str2[0]) > 0) return 1;
        else if (str1[2].compareTo(str2[2]) == 0 && str1[1].compareTo(str2[1]) == 0 &&
                str1[0].compareTo(str2[0]) == 0 && this.k.getMa().compareTo(h.k.getMa()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return k + " " + phaiTra + " " + baoHanh;
    }
}
