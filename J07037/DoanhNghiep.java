//Created by Khanhnvtb

package J07037;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma, ten, soSV;

    public DoanhNghiep(String ma, String ten, String soSV) {
        this.ma = ma;
        this.ten = ten;
        this.soSV = soSV;
    }

    public int compareTo(DoanhNghiep d) {
        if (this.ma.compareTo(d.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soSV;
    }
}
