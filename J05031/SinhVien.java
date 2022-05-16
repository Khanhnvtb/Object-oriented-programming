//Created by Khanh Nguyen Van

package J05031;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop;
    private Double diem1, diem2, diem3;

    public SinhVien(String ma, String ten, String lop, double diem1, double diem2, double diem3) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public int compareTo(SinhVien s) {
        if (this.ten.compareTo(s.ten) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + diem1 + " " + diem2 + " " + diem3;
    }
}