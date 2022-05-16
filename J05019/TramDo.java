//Created by Khanh Nguyen Van

package J05019;

public class TramDo {
    private String ma, ten;
    private double luongMua;
    private int phut;

    public TramDo(int stt, String ten, String start, String end, double luongMua) {
        this.ma = "T" + String.format("%02d", stt);
        this.ten = ten;
        this.phut = tinhPhut(start, end);
        this.luongMua = luongMua;
    }

    public String getTen() {
        return ten;
    }

    public double getLuongMua() {
        return luongMua;
    }

    public int getPhut() {
        return phut;
    }

    public void setLuongMua(double luongMua) {
        this.luongMua = luongMua;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    private int tinhPhut(String start, String end) {
        String s1[] = start.split(":");
        String s2[] = end.split(":");
        int gio = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
        int phut = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
        return gio * 60 + phut;
    }

    public static double tinhLuongMuaTrungBinh(int phut, double luongMua) {
        return luongMua / phut * 60;
    }

    @Override
    public String toString() {
        return ma + " " + ten;
    }
}
