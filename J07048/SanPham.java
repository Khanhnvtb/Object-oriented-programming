//Created by Khanhnvtb

package J07048;

public class SanPham implements Comparable<SanPham> {
    private String ma, ten;
    private int gia, baoHanh;

    public SanPham(String ma, String ten, int gia, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baoHanh = baoHanh;
    }

    public int compareTo(SanPham s) {
        if (this.gia < s.gia) return 1;
        else if (this.gia == s.gia && this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + baoHanh;
    }
}
