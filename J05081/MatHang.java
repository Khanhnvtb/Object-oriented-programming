package J05081;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten, donVi;
    private int giaMua, giaBan, loiNhuan;

    public MatHang(int stt, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", stt);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public int compareTo(MatHang m) {
        if (this.loiNhuan <= m.loiNhuan) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " +
                ten + " " +
                donVi + " " +
                giaMua + " " + giaBan + " " + loiNhuan;
    }
}
