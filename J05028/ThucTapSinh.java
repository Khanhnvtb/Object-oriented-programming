//Created by Khanh Nguyen Van

package J05028;

public class ThucTapSinh implements Comparable<ThucTapSinh> {
    private String ma, ten;
    private int soLuong;

    public ThucTapSinh(String ma, String ten, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public int compareTo(ThucTapSinh t) {
        if (this.soLuong < t.soLuong) return 1;
        else if (this.soLuong == t.soLuong && this.ma.compareTo(t.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soLuong;
    }
}
