//Created by Khanh Nguyen Van

package CodePtit;

import java.math.BigInteger;
import java.util.*;

public class J03011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String a = in.next();
            String b = in.next();
            BigInteger A = new BigInteger(a, 10);
            BigInteger B = new BigInteger(b, 10);
            BigInteger res = A.gcd(B);
            System.out.println(res);
        }
    }
}
