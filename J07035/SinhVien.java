//Created by Khanhnvtb

package J07035;

import java.util.HashMap;

public class SinhVien {
    private String ma, ten, lop, email;
    private HashMap<String, Double> hm = new HashMap<>();

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = chuanHoa(ten.trim());
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void tinhDiem(String maMon, double diem) {
        hm.put(maMon, diem);
    }

    public double getDiem(String maMon) {
        return hm.get(maMon);
    }

    public HashMap<String, Double> getHm() {
        return hm;
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

