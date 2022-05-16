//Created by Khanh Nguyen Van

package CodePtit;

import java.math.BigInteger;
import java.util.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String a = in.next();
            String b = in.next();
            int size = Math.max(a.length(), b.length());
            BigInteger A = new BigInteger(a, 10);
            BigInteger B = new BigInteger(b, 10);
            BigInteger res = A.subtract(B).abs();
            String s = res.toString();
            size -= s.length();
            while (size-- > 0) System.out.print("0");
            System.out.println(res);
        }
    }
}
