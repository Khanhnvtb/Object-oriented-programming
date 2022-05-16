package J07083;

public class NhiemVu implements Comparable<NhiemVu> {
    private SinhVien sv;
    private DeTai deTai;

    public NhiemVu(SinhVien sv, DeTai deTai) {
        this.sv = sv;
        this.deTai = deTai;
    }

    public int compareTo(NhiemVu n) {
        return this.sv.compareTo(n.sv);
    }

    @Override
    public String toString() {
        return sv + " " + deTai;
    }
}

