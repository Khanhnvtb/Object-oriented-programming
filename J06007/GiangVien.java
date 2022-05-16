//Created by Khanh Nguyen Van

package J06007;

import java.util.*;

public class GiangVien {
    private String ma, ten;
    private double soGio;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.soGio = 0;
    }

    public String getMa() {
        return ma;
    }

    public void setSoGio(double gio) {
        this.soGio =this.soGio+ gio;
    }

    @Override
    public String toString() {
        return ten + " " + String.format("%.2f", soGio);
    }
}
