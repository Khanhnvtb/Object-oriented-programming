package J07082;

public class DeTai{
    private String ma, gv, deTai;

    public DeTai(int stt, String gv, String deTai) {
        this.ma = String.format("DT%03d", stt);
        this.gv = gv;
        this.deTai = deTai;
    }

    public int compareTo(DeTai d) {
        return this.deTai.compareTo(d.deTai);
    }

    @Override
    public String toString() {
        return gv + " " +
                deTai;
    }
}
