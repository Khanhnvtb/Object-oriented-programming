//Created by Khanhnvtb

package J07033;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten.trim());
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String ten) {
        String str[] = ten.split("\\s+");
        String ans = "";
        for (String s : str)
            ans += s.toUpperCase().charAt(0) + s.toLowerCase().substring(1) + " ";
        return ans;
    }

    public int compareTo(SinhVien s) {
        if (this.ma.compareTo(s.ma) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + lop + " " + email;
    }
}