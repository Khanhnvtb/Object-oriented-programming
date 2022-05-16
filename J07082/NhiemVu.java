package J07082;

public class NhiemVu implements Comparable<NhiemVu>{
    private SinhVien sv;
    private DeTai deTai;

    public NhiemVu(SinhVien sv, DeTai deTai) {
        this.sv = sv;
        this.deTai = deTai;
    }

    public int compareTo(NhiemVu n){
        return this.deTai.compareTo(n.deTai);
    }

    @Override
    public String toString() {
        return sv + " " + deTai;
    }
}
