//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            while (n % 2 == 0) n /= 2;
            for (int i = 3; i <= Math.sqrt(n); i += 2)
                while (n % i == 0) n /= i;
            if (n > 2) System.out.println(n);
        }
    }
}
