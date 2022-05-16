//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;
import java.math.BigInteger;

public class J03012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            System.out.println(a.add(b));
        }
    }
}
