package J07060;

public class LichThi implements Comparable<LichThi> {
    private MonThi monThi;
    private CaThi caThi;
    private String nhom, sinhVien;

    public LichThi(MonThi monThi, CaThi caThi, int nhom, String sinhVien) {
        this.monThi = monThi;
        this.caThi = caThi;
        this.nhom = String.format("%02d", nhom);
        this.sinhVien = sinhVien;
    }

    public int compareTo(LichThi l) {
        if (this.caThi.getNgay().compareTo(l.caThi.getNgay()) > 0) return 1;
        else if (this.caThi.getNgay().compareTo(l.caThi.getNgay()) == 0 &&
                this.caThi.getGio().compareTo(l.caThi.getGio()) > 0) return 1;
        else if (this.caThi.getNgay().compareTo(l.caThi.getNgay()) == 0 &&
                this.caThi.getGio().compareTo(l.caThi.getGio()) == 0 &&
                this.caThi.getMa().compareTo(l.caThi.getMa()) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return caThi + " " + monThi + " " + nhom + " " + sinhVien;
    }
}
