package J07020;

public class MatHang {
    private String maMH, tenMH, donViTinh;
    private int giaMua, giaBan;

    public MatHang(int stt, String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = "MH" + String.format("%02d", stt);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return tenMH + " " + donViTinh + " " + giaMua + " " + giaBan + " ";
    }
}
