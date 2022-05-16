package J07074;

public class LichGD implements Comparable<LichGD> {
    private String ma;
    private MonHoc mon;
    private String thu, kip, gv, phong;

    public LichGD(int stt, MonHoc mon, String thu, String kip, String gv, String phong) {
        this.ma = String.format("HP%03d", stt);
        this.mon = mon;
        this.thu = thu;
        this.kip = kip;
        this.gv = gv;
        this.phong = phong;
    }

    public MonHoc getMon() {
        return mon;
    }

    public int compareTo(LichGD l) {
        if (this.thu.compareTo(l.thu) > 0) return 1;
        else if (this.thu.compareTo(l.thu) == 0 && this.kip.compareTo(l.kip) > 0) return 1;
        else if (this.thu.compareTo(l.thu) == 0 && this.kip.compareTo(l.kip) == 0) return this.gv.compareTo(l.gv);
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + thu + " " +
                kip + " " +
                gv + " " +
                phong;
    }
}
