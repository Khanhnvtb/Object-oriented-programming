//Created by Khanh Nguyen Van

package J05070;

public class TranDau implements Comparable<TranDau> {
    private String ma, tenDoi;
    private int soVe, doanhThu;

    public TranDau(String tenDoi, int soVe) {
        this.tenDoi = tenDoi;
        this.soVe = soVe;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setDoanhThu(int giaVe) {
        this.doanhThu = giaVe * soVe;
    }

    public int compareTo(TranDau t) {
        if (this.doanhThu < t.doanhThu) return 1;
        else if (this.doanhThu == t.doanhThu && this.tenDoi.compareTo(t.tenDoi) >= 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + tenDoi + " " + doanhThu;
    }
}