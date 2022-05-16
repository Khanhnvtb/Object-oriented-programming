//Created by Khanh Nguyen Van

package J04018;

import java.util.*;

public class Main {
    public static SoPhuc cong(SoPhuc a, SoPhuc b) {
        SoPhuc tmp = new SoPhuc(a.getThuc() + b.getThuc(), a.getAo() + b.getAo());
        return tmp;
    }

    public static SoPhuc nhan(SoPhuc a, SoPhuc b) {
        return new SoPhuc(a.getThuc() * b.getThuc() - a.getAo() * b.getAo(),
                a.getThuc() * b.getAo() + a.getAo() * b.getThuc());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            SoPhuc A = new SoPhuc(in.nextInt(), in.nextInt());
            SoPhuc B = new SoPhuc(in.nextInt(), in.nextInt());
            System.out.println((nhan(A, cong(A, B))) + ", " + nhan(cong(A, B), cong(A, B)));
        }
    }
}
