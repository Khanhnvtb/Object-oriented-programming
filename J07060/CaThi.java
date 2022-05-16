package J07060;

public class CaThi{
    private String ma, ngay, gio, phong;

    public CaThi() {
    }

    public CaThi(int stt, String ngay, String gio, String phong) {
        this.ma = "C" + String.format("%03d", stt);
        this.ngay = chuanHoaNgay(ngay);
        this.gio = chuanHoaGio(gio);
        this.phong = phong;
    }

    private String chuanHoaNgay(String ngay) {
        String str[] = ngay.split("/");
        int d = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);
        return String.format("%02d/%02d/%04d", d, m, y);
    }

    private String chuanHoaGio(String gio) {
        String str[] = gio.split(":");
        int g = Integer.parseInt(str[0]);
        int p = Integer.parseInt(str[1]);
        return String.format("%02d:%02d", g, p);
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ngay + " " + gio + " " + phong;
    }
}
