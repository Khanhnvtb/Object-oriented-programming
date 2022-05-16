//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res =0;
        long tmp = 1;
        for (int i = 1; i <= n; i++) res += tmp *= i;
        System.out.println(res);
    }
}
