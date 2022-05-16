//Created by Khanh Nguyen Van

package J05035;

public class ThucTapSinh implements Comparable<ThucTapSinh> {
    private int stt;
    private String maSv, hoTen, lop, email, doanhNhgiep;

    public ThucTapSinh(int stt, String maSv, String hoTen, String lop, String email, String doanhNhgiep) {
        this.stt = stt;
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNhgiep = doanhNhgiep;
    }

    public String getDoanhNhgiep() {
        return doanhNhgiep;
    }

    public int compareTo(ThucTapSinh t) {
        if (this.maSv.compareTo(t.maSv) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return stt + " " + maSv + " " + hoTen + " " + lop + " " + email + " " + doanhNhgiep;
    }
}
