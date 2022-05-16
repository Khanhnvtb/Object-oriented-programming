package J07056;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten;
    private int tienTrong, tienVuot, vat, tongTien;

    public KhachHang(int stt, String ten, String s) {
        String str[] = s.split(" ");
        int soDien = Integer.parseInt(str[2]) - Integer.parseInt(str[1]);
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = chuanHoa(ten.trim());
        this.tienTrong = timTienTrong(str[0].charAt(0), soDien);
        this.tienVuot = timTienVuot(str[0].charAt(0), soDien);
        this.vat = tienVuot / 20;
        this.tongTien = tienTrong + tienVuot + vat;
    }

    private String chuanHoa(String ten) {
        String s[] = ten.split("\\s+");
        String ans = "";
        for (String str : s) {
            ans += str.toUpperCase().charAt(0);
            ans += str.toLowerCase().substring(1) + " ";
        }
        return ans;
    }

    private int timTienTrong(char c, int soDien) {
        if (c == 'A') {
            if (soDien > 100) return 100 * 450;
            else return soDien * 450;
        } else if (c == 'B') {
            if (soDien > 500) return 500 * 450;
            else return soDien * 450;
        } else {
            if (soDien > 200) return 200 * 450;
            else return soDien * 450;
        }
    }

    private int timTienVuot(char c, int soDien) {
        if (c == 'A') {
            if (soDien > 100) return (soDien - 100) * 1000;
            else return 0;
        } else if (c == 'B') {
            if (soDien > 500) return (soDien - 500) * 1000;
            else return 0;
        } else {
            if (soDien > 200) return (soDien - 200) * 1000;
            else return 0;
        }
    }

    public int compareTo(KhachHang k) {
        if (this.tongTien < k.tongTien) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + tienTrong + " " + tienVuot + " " + vat + " " + tongTien;
    }
}
