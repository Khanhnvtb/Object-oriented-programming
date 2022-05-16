//Created by Khanh Nguyen Van

package J06006;

public class MatHang {
    private String maMH, tenMH, donViTinh;
    private int giaMua, giaBan;

    public MatHang(int stt, String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = "MH" + String.format("%03d", stt);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return tenMH + " ";
    }
}
