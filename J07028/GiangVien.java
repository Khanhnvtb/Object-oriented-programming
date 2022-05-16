//Created by Khanhnvtb

package J07028;

public class GiangVien {
    private String ma, ten;
    private double gioChuan;

    public GiangVien(String s) {
        String str[] = s.split(" ");
        this.ma = str[0];
        this.ten = "";
        for (int i = 1; i < str.length; i++)
            this.ten += str[i] + " ";
        this.gioChuan = 0;
    }

    public String getMa() {
        return ma;
    }

    public void setGioChuan(double gio) {
        this.gioChuan += gio;
    }

    @Override
    public String toString() {
        return ten + " " + String.format("%.2f", gioChuan);
    }
}

