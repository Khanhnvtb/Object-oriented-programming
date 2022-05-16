//Created by Khanh Nguyen Van

package J05069;

public class TranDau {
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

    @Override
    public String toString() {
        return ma + " " + tenDoi + " " + doanhThu;
    }
}
