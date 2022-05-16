//Created by Khanh Nguyen Van

package J05057;

public class HocSinh {
    private String ma, hoTen, trangThai;
    private double diemUutien, tongDiem;

    public HocSinh(String ma, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diemUutien = tinhDiemUutien(ma);
        this.tongDiem = diemToan * 2 + diemHoa + diemLy;
        this.trangThai = timTrangThai(tongDiem, diemUutien);
    }

    private double tinhDiemUutien(String ma) {
        char c = ma.charAt(2);
        if (c == '1') return 0.5;
        else if (c == '2') return 1;
        return 2.5;
    }

    private String timTrangThai(double tongDiem, double diemUutien) {
        double diem = tongDiem + diemUutien;
        if (diem >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }

    private String toStringDiem(double diem) {
        if (diem - (int) diem == 0) return String.format("%.0f", diem);
        return String.format("%.1f", diem);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + toStringDiem(diemUutien) + " " + toStringDiem(tongDiem) + " " + trangThai;
    }
}

