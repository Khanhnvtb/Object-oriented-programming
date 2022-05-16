//Created by Khanh Nguyen Van

package J05066;

public class NhanVien implements Comparable<NhanVien> {
    private String ten, ma, so, bac;

    public NhanVien(String ma, String ten) {
        this.ten = ten;
        this.ma = ma.charAt(0) + "" + ma.charAt(1);
        this.so = ma.charAt(4) + "" + ma.charAt(5) + "" + ma.charAt(6);
        this.bac = ma.charAt(2) + "" + ma.charAt(3);
    }

    public String getTen() {
        return ten;
    }

    public int compareTo(NhanVien n) {
        if (Integer.parseInt(this.bac) < Integer.parseInt(n.bac)) return 1;
        else if (Integer.parseInt(this.bac) == Integer.parseInt(n.bac) &&
                Integer.parseInt(this.so) > Integer.parseInt(n.so)) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + so + " " + bac;
    }
}