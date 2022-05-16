//Created by Khanh Nguyen Van

package J05054;

public class HocSinh implements Comparable<HocSinh> {
    private String ma, hoTen, xepLoai;
    private double DTB;

    public HocSinh(int stt, String hoTen, double DTB) {
        this.ma = "HS" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.DTB = DTB;
        this.xepLoai = tinhXepLoai(DTB);
    }

    private String tinhXepLoai(double DTB) {
        if (DTB >= 9) return "Gioi";
        else if (DTB >= 7) return "Kha";
        else if (DTB >= 5) return "Trung Binh";
        return "Yeu";
    }

    public double getDTB() {
        return DTB;
    }

    public int compareTo(HocSinh h) {
        if (this.DTB < h.DTB) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + DTB + " " + xepLoai;
    }
}