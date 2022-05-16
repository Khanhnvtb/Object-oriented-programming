//Created by Khanh Nguyen Van

package J05021;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, hoTen, lop, email;

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public int compareTo(SinhVien s) {
        if (this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + email;
    }
}
