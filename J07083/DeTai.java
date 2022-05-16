package J07083;

public class DeTai {
    private String ma, gv, deTai;

    public DeTai(int stt, String gv, String deTai) {
        this.ma = String.format("DT%03d", stt);
        this.gv = gv;
        this.deTai = deTai;
    }

    @Override
    public String toString() {
        return deTai + " " + gv;
    }
}
