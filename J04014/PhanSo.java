//Created by Khanh Nguyen Van

package J04014;

public class PhanSo {
    private long numeratortu, denominator;

    public PhanSo(long numeratortu, long denominator) {
        this.numeratortu = numeratortu;
        this.denominator = denominator;
    }

    public PhanSo add(PhanSo s) {
        return new PhanSo(this.numeratortu * s.denominator + this.denominator * s.numeratortu,
                this.denominator * s.denominator);
    }

    public PhanSo multiphy(PhanSo s){
        return new PhanSo(this.numeratortu * s.numeratortu, this.denominator * s.denominator);
    }
    private long gcd(long a, long b) {
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
