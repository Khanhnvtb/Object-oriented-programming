//Created by Khanh Nguyen Van

package J05010;

public class MatHang implements Comparable<MatHang> {
    private int ma;
    private String ten, nhom;
    private double loiNhuan;

    public MatHang(int ma, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.loiNhuan = giaBan - giaMua;
    }

    public int compareTo(MatHang m) {
        if (this.loiNhuan < m.loiNhuan) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
