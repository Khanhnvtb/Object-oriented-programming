//Created by Khanhnvtb

package J07038;

public class SinhVien{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten.trim());
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    private String chuanHoa(String ten) {
        String str[] = ten.split("\\s+");
        String ans = "";
        for (String s : str)
            ans += s.toUpperCase().charAt(0) + s.toLowerCase().substring(1) + " ";
        return ans;
    }

    @Override
    public String toString() {
        return ma + " " + ten + lop;
    }
}
