//Created by Khanh Nguyen Van

package J04018;

public class SoPhuc {

    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public int getThuc() {
        return thuc;
    }

    public int getAo() {
        return ao;
    }

    @Override
    public String toString() {
        if (ao >= 0) return thuc + " + " + ao + "i";
        return thuc + " - " + Math.abs(ao) + "i";
    }
}