//Created by Khanh Nguyen Van

package J05026;

public class GiangVien {
    private String ma, hoTen, boMon;

    public GiangVien(int stt, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }

    public String getBoMon() {
        return boMon;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + boMon;
    }
}
