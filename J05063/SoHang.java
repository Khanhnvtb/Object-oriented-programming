//Created by Khanh Nguyen Van

package J05063;

public class SoHang implements Comparable<SoHang> {
    private int heSo, bac;

    public SoHang(int heSo, int bac) {
        this.heSo = heSo;
        this.bac = bac;
    }

    public int getHeSo() {
        return heSo;
    }

    public int getBac() {
        return bac;
    }

    public int compareTo(SoHang s) {
        if (this.bac < s.bac) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return heSo + "*x^" + bac;
    }
}

