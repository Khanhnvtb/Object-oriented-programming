//Created by Khanh Nguyen Van

package J05051;

public class Dien implements Comparable<Dien> {
    private String ma;
    private int heSo, thanhTien, phuTroi, phaiTra;

    public Dien(int stt, String loaiSD, int chiSoCu, int chiSoMoi) {
        this.ma = "KH" + String.format("%02d", stt);
        this.heSo = tinhHeSo(loaiSD);
        this.thanhTien = tinhTien(chiSoCu, chiSoMoi);
        this.phuTroi = tinhPhuTroi(chiSoCu, chiSoMoi);
        this.phaiTra = thanhTien + phuTroi;
    }

    private int tinhHeSo(String loaiSD) {
        if (loaiSD.equals("KD")) return 3;
        else if (loaiSD.equals("NN")) return 5;
        else if (loaiSD.equals("TT")) return 4;
        return 2;
    }

    private int tinhTien(int chiSoCu, int chiSoMoi) {
        return (chiSoMoi - chiSoCu) * heSo * 550;
    }

    private int tinhPhuTroi(int chiSoCu, int chiSoMoi) {
        if (chiSoMoi - chiSoCu < 50) return 0;
        else if (chiSoMoi - chiSoCu <= 100) return Math.round((float) thanhTien / 100 * 35);
        return thanhTien;
    }

    public int compareTo(Dien d) {
        if (this.phaiTra < d.phaiTra) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + " " + heSo + " " + thanhTien + " " + phuTroi + " " + phaiTra;
    }
}

