//Created by Khanhnvtb

package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String ma, ten, gia, phi;

    public LoaiPhong(String s) {
        String str[] = s.split(" ");
        this.ma = str[0];
        this.ten = str[1];
        this.gia = str[2];
        this.phi = str[3];
    }

    public int compareTo(LoaiPhong l) {
        if (this.ten.compareTo(l.ten) >= 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + phi;
    }
}
