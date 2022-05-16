//Created by Khanh Nguyen Van

package J05045;

public class NhanVien implements Comparable<NhanVien>{
    private String ma, hoTen;
    private int phuCap, luongChinh, tamUng, conLai;

    public NhanVien(int stt, String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
        this.ma = "NV" + String.format("%02d", stt);
        this.hoTen = hoTen;
        this.phuCap = timPhuCap(chucVu);
        this.luongChinh = luongCoBan * soNgayCong;
        this.tamUng = timTamUng(phuCap, luongChinh);
        this.conLai = luongChinh + phuCap - tamUng;
    }

    private static int timPhuCap(String chucVu) {
        if (chucVu.equals("GD")) return 500;
        else if (chucVu.equals("PGD")) return 400;
        else if (chucVu.equals("TP")) return 300;
        else if (chucVu.equals("KT")) return 250;
        return 100;
    }

    private static int timTamUng(int phuCap, int luongChinh) {
        if ((phuCap + luongChinh) * 2 / 3 < 25000)
            return (int) (Math.round((phuCap + luongChinh) * 2 / 3 / 1000.0) * 1000);
        else return 25000;
    }

    public int compareTo(NhanVien n){
        if(this.luongChinh + this.phuCap <= n.luongChinh + n.phuCap) return 1;
        return -1;
    }
    @Override
    public String toString() {
        return ma + " " + hoTen + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai;
    }
}
