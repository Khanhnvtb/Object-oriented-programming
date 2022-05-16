//Created by Khanh Nguyen Van

package J05018;

public class HocSinh implements Comparable<HocSinh> {
    private String maHocSinh, hoTen;
    private double diemTrungBinh;

    public HocSinh(int stt, String hoTen, String diem) {
        this.maHocSinh = "HS" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.diemTrungBinh = tinhDiem(diem);
    }

    public static double tinhDiem(String diem) {
        String s[] = diem.split("\\s+");
        double diemTrungBinh = 0;
        for (String tmp : s) {
            diemTrungBinh += Double.parseDouble(tmp);
        }
        diemTrungBinh += Double.parseDouble(s[0]);
        diemTrungBinh += Double.parseDouble(s[1]);
        diemTrungBinh /= 12;
        return Math.round(diemTrungBinh * 10.0) / 10.0;
    }

    public static String danhGia(double diemTrungBinh) {
        if (diemTrungBinh >= 9) return "XUAT SAC";
        else if (diemTrungBinh >= 8) return "GIOI";
        else if (diemTrungBinh >= 7) return "KHA";
        else if (diemTrungBinh >= 5) return "TB";
        return "YEU";
    }

    public int compareTo(HocSinh h) {
        if (this.diemTrungBinh <= h.diemTrungBinh) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return maHocSinh + " " + hoTen + " " + String.format("%.1f", diemTrungBinh) + " " + danhGia(diemTrungBinh);
    }
}
