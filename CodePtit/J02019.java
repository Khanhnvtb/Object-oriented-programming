//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02019 {
    static int cntDivisor[];

    public static void createSumDivisorOfNumber(int n) {
        cntDivisor = new int[n + 1];
        for (int i = 0; i <= n; i++) cntDivisor[i] = 1;
        for (int i = 2; i <= n / 2; i++)
            for (int j = i * 2; j <= n; j += i)
                cntDivisor[j] += i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        int start = in.nextInt();
        int end = in.nextInt();
        createSumDivisorOfNumber(end);
        for (int i = start; i <= end; i++)
            if (cntDivisor[i] > i) res++;
        System.out.print(res);
    }
}
