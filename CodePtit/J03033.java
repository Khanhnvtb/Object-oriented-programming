//Created by Khanh Nguyen Van

package CodePtit;

import java.math.BigInteger;
import java.util.*;

public class J03033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(in.nextLine());
            BigInteger b = new BigInteger(in.nextLine());
            System.out.println(a.divide(a.gcd(b)).multiply(b));
        }
    }
}
