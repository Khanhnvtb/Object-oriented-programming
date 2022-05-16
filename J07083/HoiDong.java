package J07083;

import java.util.ArrayList;
import java.util.Collections;

public class HoiDong implements Comparable<HoiDong> {
    private String ma;
    private ArrayList<NhiemVu> list;

    public HoiDong(SinhVien sv, DeTai deTai, String ma) {
        this.ma = ma;
        this.list = new ArrayList<>();
        this.list.add(new NhiemVu(sv, deTai));
    }

    public void addNV(SinhVien sv, DeTai deTai) {
        this.list.add(new NhiemVu(sv, deTai));
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public char getMa() {
        return ma.charAt(2);
    }

    public int compareTo(HoiDong h) {
        return this.ma.compareTo(h.ma);
    }

    @Override
    public String toString() {
        String ans = "";
        for (NhiemVu n : list)
            ans += n + "\n";
        return ans;
    }
}
