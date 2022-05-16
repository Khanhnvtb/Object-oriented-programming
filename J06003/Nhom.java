//Created by Khanh Nguyen Van

package J06003;

import java.util.ArrayList;

public class Nhom {
    private int soNhom;
    private ArrayList<SinhVien> a = new ArrayList<>();
    private String deTai;

    public Nhom(int soNhom) {
        this.soNhom = soNhom;
    }

    public ArrayList<SinhVien> getA() {
        return a;
    }

    public void setDeTai(String deTai) {
        this.deTai = "Bai tap dang ky: " + deTai;
    }

    @Override
    public String toString() {
        String ans = "DANH SACH NHOM " + soNhom + ":\n";
        for (int i = 0; i < this.a.size(); i++)
            ans += a.get(i);
        ans += deTai;
        return ans;
    }
}
