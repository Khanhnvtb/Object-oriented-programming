//Created by Khanh Nguyen Van

package J06004;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, hoTen, sdt;
    private int soNhom;

    public SinhVien(String ma, String hoTen, String sdt, int soNhom) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.soNhom = soNhom;
    }

    public int getSoNhom() {
        return soNhom;
    }

    public int compareTo(SinhVien s) {
        if (this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + sdt + " " + soNhom;
    }
}
