//Created by Khanh Nguyen Van

package J05017;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten;
    private int tienNuoc;

    public KhachHang(int stt, String ten, int chiSoCu, int chiSoMoi) {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.tienNuoc = tinhTien(chiSoCu, chiSoMoi);
    }

    private int timPhuPhi(int chiSo) {
        if (chiSo <= 50) return 2;
        else if (chiSo <= 100) return 3;
        return 5;
    }

    private int tinhTien(int chiSoCu, int chiSoMoi) {
        int chiSo = chiSoMoi - chiSoCu;
        int phuPhi = timPhuPhi(chiSo);
        int a[] = {100, 150, 200};
        int inDex = 0;
        int tien = 0;
        while (chiSo > 0 && inDex < 2) {
            if (chiSo <= 50) {
                tien += chiSo * a[inDex];
                chiSo = 0;
            } else {
                tien += 50 * a[inDex++];
                chiSo -= 50;
            }
        }
        tien += chiSo * 200;
        return (int) Math.round((double) tien / 100 * (100 + phuPhi));
    }

    public int compareTo(KhachHang k) {
        if (this.tienNuoc < k.tienNuoc) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienNuoc;
    }
}
