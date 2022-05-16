//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;
import java.math.BigInteger;

public class J03015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger res = A.subtract(B);
        System.out.println(res);
    }
}
