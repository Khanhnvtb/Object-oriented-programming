//Created by Khanh Nguyen Van

package J05013;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ma, ten, trangThai;
    private double diem;

    public ThiSinh(int stt, String ten, double diemLT, double diemTH) {
        this.ma = "TS" + String.format("%02d", stt);
        this.ten = ten;
        if (diemLT > 10) diemLT /= 10;
        if (diemTH > 10) diemTH /= 10;
        this.diem = (diemLT + diemTH) / 2;
        this.trangThai = xepLoai();
    }

    private String xepLoai() {
        if (diem > 9.5) return "XUAT SAC";
        else if (diem >= 8) return "DAT";
        else if (diem >= 5) return "CAN NHAC";
        return "TRUOT";
    }

    public int compareTo(ThiSinh t) {
        if (this.diem < t.diem) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f",diem) + " " + trangThai;
    }
}
