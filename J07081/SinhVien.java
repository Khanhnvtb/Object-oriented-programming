package J07081;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, so, email;

    public SinhVien(String ma, String ten, String so, String email) {
        this.ma = ma;
        this.ten = ten;
        this.so = so;
        this.email = email;
    }

    public String convert(String ten) {
        String s[] = ten.split(" ");
        String ans = s[s.length - 1];
        for (int i = 0; i < s.length - 1; i++)
            ans += " " + s[i];
        return ans;
    }

    public int compareTo(SinhVien s) {
        int t = convert(this.ten).compareTo(convert(s.ten));
        if (t == 0) return this.ma.compareTo(s.ma);
        else return t;
    }

    @Override
    public String toString() {
        return ma + " " +
                ten + " " +
                so + " " +
                email;
    }
}
