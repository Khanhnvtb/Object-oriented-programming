//Created by Khanh Nguyen Van

package J05071;

public class CuocGoi {
    private String tinh, soDT;
    private int soPhut, giaCuoc, phaiTra;

    public CuocGoi(String tinh, int giaCuoc) {
        this.tinh = tinh;
        this.giaCuoc = giaCuoc;
    }

    public CuocGoi() {
    }

    public String getTinh() {
        return tinh;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }

    public void setGiaCuoc(int giaCuoc) {
        this.giaCuoc = giaCuoc;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void setSoPhut(char c, String s) {
        int h = Integer.parseInt(s.substring(6, 8)) - Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(9)) - Integer.parseInt(s.substring(3, 5));
        int tmp = h * 60 + m;
        if (c != '0') {
            if (tmp % 3 == 0) this.soPhut = tmp / 3;
            else this.soPhut = tmp / 3 + 1;
        } else this.soPhut = tmp;
    }

    public void setPhaiTra(char c) {
        if (c != '0') this.phaiTra = soPhut * 800;
        else this.phaiTra = soPhut * giaCuoc;
    }

    @Override
    public String toString() {
        return soDT + " " + tinh + " " + soPhut + " " + phaiTra;
    }
}

