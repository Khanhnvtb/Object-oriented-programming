package J05080;

public class HocPhan implements Comparable<HocPhan> {
    private String ma, ten, nhom;

    public HocPhan(String ma, String ten, String nhom) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
    }

    public int compareTo(HocPhan h) {
        if (this.ma.compareTo(h.ma) > 0) return 1;
        else if (this.ma.compareTo(h.ma) == 0 && Integer.parseInt(this.nhom) > Integer.parseInt(h.nhom)) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom;
    }
}
