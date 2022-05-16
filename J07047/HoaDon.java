//Created by Khanhnvtb

package J07047;

public class HoaDon implements Comparable<HoaDon> {
    private KhachHang k;
    private LoaiPhong l;
    private double phaiTra;

    public HoaDon(KhachHang k, LoaiPhong l) {
        this.k = k;
        this.l = l;
        this.phaiTra = tinhTien();
    }

    private double tinhTien() {
        int ngay = k.getSoNgay();
        if (ngay == 0) ngay = 1;
        double tien = ngay * l.getGia() * (1 + l.getPhi());
        if (ngay < 10) return tien;
        if (ngay < 20) return tien * 0.98;
        if (ngay < 30) return tien * 0.96;
        return tien * 0.94;
    }

    public int compareTo(HoaDon h) {
        if (this.k.getSoNgay() < h.k.getSoNgay()) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return k + " " + String.format("%.2f", phaiTra);
    }
}
