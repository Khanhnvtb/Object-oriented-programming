package J07058;

public class MonThi implements Comparable<MonThi> {
    private String ma, ten, hinhThuc;

    public MonThi(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public int compareTo(MonThi m) {
        if (this.ma.compareTo(m.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhThuc;
    }
}
