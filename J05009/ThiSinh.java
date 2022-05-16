//Created by Khanh Nguyen Van

package J05009;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ten, ngaySinh;
    private int ma;
    private double tongDiem;

    public ThiSinh(int stt, String ten, String ngaySinh, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ma = stt;
        this.tongDiem = diem1 + diem2 + diem3;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    public int compareTo(ThiSinh t) {
        if (this.tongDiem < t.tongDiem) return 1;
        else if (this.tongDiem == t.tongDiem && this.ma > t.ma) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ngaySinh + " " + tongDiem;
    }
}
