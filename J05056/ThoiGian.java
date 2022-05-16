//Created by Khanh Nguyen Van

package J05056;

public class ThoiGian {
    private int gio, phut, giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian truThoiGian(ThoiGian t) {
        int h = t.gio - this.gio;
        int p = t.phut - this.phut;
        int s = t.giay - this.giay;
        if (s < 0) {
            s += 60;
            p--;
        }
        if (p < 0) {
            p += 60;
            h--;
        }
        return new ThoiGian(h, p, s);
    }

    public int compareTo(ThoiGian t) {
        if (this.gio > t.gio) return 1;
        else if (this.gio == t.gio && this.phut > t.phut) return 1;
        else if (this.gio == t.gio && this.phut == t.phut && this.giay > t.giay) return 1;
        else if (this.gio == t.gio && this.phut == t.phut && this.giay == t.giay) return 0;
        return -1;
    }

    @Override
    public String toString() {
        return String.format("%02d", gio) + ":" + String.format("%02d", phut) + ":" + String.format("%02d", giay);
    }
}
