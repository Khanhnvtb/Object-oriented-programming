//Created by Khanh Nguyen Van

package J04003;

public class PhanSo {
    private long numeratortu, denominator;

    public PhanSo(long numeratortu, long denominator) {
        this.numeratortu = numeratortu;
        this.denominator = denominator;
    }

    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public void rutGon() {
        long GCD = gcd(this.numeratortu, this.denominator);
        this.numeratortu /= GCD;
        this.denominator /= GCD;
    }
    @Override
    public String toString() {
        return this.numeratortu + "/" + this.denominator;
    }
}
