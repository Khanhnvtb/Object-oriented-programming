//Created by Khanh Nguyen Van

package J05058;

public class HocSinh implements Comparable<HocSinh> {
    private String ma, hoTen, trangThai;
    private double diemUutien, diemXetTuyen;

    public HocSinh(String ma, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diemUutien = tinhDiemUutien(ma);
        this.diemXetTuyen = diemToan * 2 + diemHoa + diemLy + diemUutien;
        this.trangThai = timTrangThai(diemXetTuyen);
    }

    private double tinhDiemUutien(String ma) {
        char c = ma.charAt(2);
        if (c == '1') return 0.5;
        else if (c == '2') return 1;
        return 2.5;
    }

    private String timTrangThai(double diemXetTuyen) {
        if (diemXetTuyen >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }

    private String toStringDiem(double diem) {
        if (diem - (int) diem == 0) return String.format("%.0f", diem);
        return String.format("%.1f", diem);
    }

    public int compareTo(HocSinh h) {
        if (this.diemXetTuyen <= h.diemXetTuyen) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + toStringDiem(diemUutien) + " " + toStringDiem(diemXetTuyen)
                + " " + trangThai;
    }
}