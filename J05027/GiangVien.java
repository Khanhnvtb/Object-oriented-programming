//Created by Khanh Nguyen Van

package J05027;

public class GiangVien {
    private String ma, hoTen, boMon;

    public GiangVien(int stt, String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }

    public String getHoTen() {
        return hoTen;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + boMon;
    }
}