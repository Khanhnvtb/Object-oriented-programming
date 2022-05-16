//Created by Khanh Nguyen Van

package J05014;

public class GiaoVien implements Comparable<GiaoVien> {
    private String ma, ten, monHoc, trangThai;
    private double diem;

    public GiaoVien(int stt, String ten, String maXetTuyen, double diemTH, double diemCM) {
        this.ma = "GV" + String.format("%02d", stt);
        this.ten = ten;
        this.monHoc = timMonHoc(maXetTuyen);
        this.diem = diemTH * 2 + diemCM + diemUT(maXetTuyen);
        this.trangThai = xepLoai();
    }

    private String timMonHoc(String maXetTuyen) {
        if (maXetTuyen.charAt(0) == 'A') return "TOAN";
        else if (maXetTuyen.charAt(0) == 'B') return "LY";
        return "HOA";
    }

    private double diemUT(String maXetTuyen) {
        if (maXetTuyen.charAt(1) == '1') return 2;
        else if (maXetTuyen.charAt(1) == '2') return 1.5;
        else if (maXetTuyen.charAt(1) == '3') return 1;
        return 0;
    }

    private String xepLoai() {
        if (diem >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }

    public int compareTo(GiaoVien g) {
        if (this.diem <= g.diem) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + monHoc + " " + String.format("%.1f", diem) + " " + trangThai;
    }
}
