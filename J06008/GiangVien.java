//Created by Khanh Nguyen Van

package J06008;

import java.util.*;

public class GiangVien {
    private String ma, ten;
    private LinkedHashMap<String, Double> ds = new LinkedHashMap<>();
    private double tongSoGio;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        this.tongSoGio = 0;
    }

    public String getMa() {
        return ma;
    }

    public void themGio(String tenMH, double gio) {
        ds.put(tenMH, gio);
    }

    public LinkedHashMap<String, Double> getDs() {
        return ds;
    }

    public double tinhTongSoGio() {
        for (Double gio : ds.values()) tongSoGio += gio;
        return tongSoGio;
    }

    @Override
    public String toString() {
        return "Giang vien: " + ten;
    }
}
