//Created by Khanhnvtb

package J07034;

public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int tinChi;

    public MonHoc(String ma, String ten, int tinChi) {
        this.ma = ma;
        this.ten = ten;
        this.tinChi = tinChi;
    }

    public int compareTo(MonHoc m) {
        if (this.ten.compareTo(m.ten) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tinChi;
    }
}
