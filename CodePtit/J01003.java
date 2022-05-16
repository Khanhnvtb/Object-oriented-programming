//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat(), b = in.nextFloat();
        if (a == 0) {
            if (b == 0) System.out.print("VSN");
            else System.out.print("VN");
        } else System.out.printf("%.2f", -b / a);
    }
}
