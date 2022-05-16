//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03008 {
    public static boolean isPrime(char n) {
        if (n != '2' && n != '3' && n != '5' && n != '7') return false;
        return true;
    }

    public static boolean isNiceNumber(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (isPrime(s.charAt(l)) == false || isPrime(s.charAt(r)) == false) return false;
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            if (isNiceNumber(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
