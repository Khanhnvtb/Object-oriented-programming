//Created by Khanhnvtb

package J07038;

public class DanhSach implements Comparable<DanhSach> {
    private String ma, ten;
    private SinhVien sv;
    private int soSV;

    public DanhSach(String ma, String ten, SinhVien sv, int soSV) {
        this.ma = ma;
        this.ten = ten;
        this.sv = sv;
        this.soSV = soSV;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSoSV() {
        return soSV;
    }

    public int compareTo(DanhSach s) {
        if (this.sv.getMa().compareTo(s.sv.getMa()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return sv.toString();
    }
}
