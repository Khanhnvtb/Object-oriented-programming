package J07050;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten, nhom;
    private double loiNhuan;

    public MatHang(int stt, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = "MH" + String.format("%02d", stt);
        this.ten = ten;
        this.nhom = nhom;
        this.loiNhuan = giaBan - giaMua;
    }

    public int compareTo(MatHang m) {
        if (this.loiNhuan <= m.loiNhuan) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
