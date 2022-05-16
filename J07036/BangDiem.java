//Created by Khanhnvtb

package J07036;

public class BangDiem implements Comparable<BangDiem> {
    private String ma, ten;
    private SinhVien sv;
    private double diem;

    public BangDiem(String ma, String ten, SinhVien sv, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.sv = sv;
        this.diem = diem;
    }

    public SinhVien getSv() {
        return sv;
    }

    public int compareTo(BangDiem b) {
        if (this.ma.compareTo(b.ma) > 0) return 1;
        else if (this.ma.equals(b.ma) && this.sv.getMa().compareTo(b.sv.getMa()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        String ans = sv + ma + " " + ten;
        int x = (int) diem;
        if (x == diem) ans += " " + x;
        else ans += " " + diem;
        return ans;
    }
}
