//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a <= 0 || b <= 0) System.out.print(0);
        else System.out.print((a + b) * 2 + " " + a * b);
    }
}
