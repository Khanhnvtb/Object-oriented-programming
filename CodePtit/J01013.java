//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01013 {
    static final int MAX_SIZE = 2000001;
    public static int P[] = new int[500000];
    public static int size = 0;
    public static int isprime[] = new int[MAX_SIZE];

    static void createPrimeNumbers(int n) {
        int SPF[] = new int[MAX_SIZE];
        for (int i = 2; i < MAX_SIZE; i++) isprime[i] = 1;
        for (int i = 2; i < n; i++) {
            if (isprime[i] == 1) {
                P[size++] = i;
                SPF[i] = i;
            }
            for (int j = 0; j < size && i * P[j] < MAX_SIZE && P[j] <= SPF[i]; j++) {
                isprime[i * P[j]] = 0;
                SPF[i * P[j]] = P[j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long res = 0;
        createPrimeNumbers(MAX_SIZE);
        while (t-- > 0) {
            int n = in.nextInt();
            if (isprime[n] == 1) res += n;
            else {
                int j = 0;
                while (n > 1) {
                    if (n % P[j] == 0) {
                        res += P[j];
                        n /= P[j];
                        if (isprime[n] == 1) {
                            res += n;
                            break;
                        }
                    } else j++;
                }
            }
        }
        System.out.print(res);
        for(int i=0;i<=Math.sqrt(1e9);i++)
            if(isprime[i]==1) System.out.print(i+", ");
    }
}
