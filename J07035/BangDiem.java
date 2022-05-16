//Created by Khanhnvtb

package J07035;

public class BangDiem implements Comparable<BangDiem> {
    private SinhVien s;
    private double diem;

    public BangDiem(SinhVien s, double diem) {
        this.s = s;
        this.diem = diem;
    }

    public int compareTo(BangDiem b) {
        if (this.diem < b.diem) return 1;
        else if (this.diem == b.diem && this.s.getMa().compareTo(b.s.getMa()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        String ans = s.toString();
        int x = (int) diem;
        if (x == diem) ans += " " + x;
        else ans += " " + diem;
        return ans;
    }
}
