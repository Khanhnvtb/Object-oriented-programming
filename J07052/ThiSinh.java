package J07052;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ma, hoTen;
    private double diemUutien, diemXetTuyen;

    public ThiSinh(String ma, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.hoTen = chuanHoa(hoTen.trim());
        this.diemUutien = tinhDiemUutien(ma);
        this.diemXetTuyen = diemToan * 2 + diemHoa + diemLy + diemUutien;
    }

    private String chuanHoa(String ten) {
        String s[] = ten.split("\\s+");
        String ans = "";
        for (String str : s) {
            ans += str.toUpperCase().charAt(0);
            ans += str.toLowerCase().substring(1) + " ";
        }
        return ans;
    }

    public double getDiemXetTuyen() {
        return diemXetTuyen;
    }

    private double tinhDiemUutien(String ma) {
        char c = ma.charAt(2);
        if (c == '1') return 0.5;
        else if (c == '2') return 1;
        return 2.5;
    }

    private String toStringDiem(double diem) {
        if (diem - (int) diem == 0) return String.format("%.0f", diem);
        return String.format("%.1f", diem);
    }

    public int compareTo(ThiSinh h) {
        if (this.diemXetTuyen <= h.diemXetTuyen) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + toStringDiem(diemUutien) + " " + toStringDiem(diemXetTuyen);
    }
}
