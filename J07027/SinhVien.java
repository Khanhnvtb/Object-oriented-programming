//Created by Khanhnvtb

package J07027;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, sdt;
    private String baiTap;

    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getMa() {
        return ma;
    }

    public void setNhom(String baiTap) {
        this.baiTap = baiTap;
    }

    public int compareTo(SinhVien s) {
        if (this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sdt + " " + baiTap;
    }
}
