//Created by Khanh Nguyen Van

package J05020;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, hoTen, lop, email;

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public int compareTo(SinhVien s) {
        if (this.lop.compareTo(s.lop) > 0) return 1;
        else if (this.lop.compareTo(s.lop) == 0 && this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + email;
    }
}
