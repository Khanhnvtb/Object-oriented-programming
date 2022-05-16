//Created by Khanh Nguyen Van

package J04004;

public class PhanSo {
    private long numeratortu, denominator;

    public PhanSo(long numeratortu, long denominator) {
        this.numeratortu = numeratortu;
        this.denominator = denominator;
    }

    public static PhanSo sumOfPhanSo(PhanSo a, PhanSo b) {
        PhanSo s = new PhanSo(a.numeratortu * b.denominator + a.denominator * b.numeratortu,
                a.denominator * b.denominator);
        return s;
    }

    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public void reDuce() {
        long GCD = gcd(this.numeratortu, this.denominator);
        this.numeratortu /= GCD;
        this.denominator /= GCD;
    }

    @Override
    public String toString() {
        return this.numeratortu + "/" + denominator;
    }
}
