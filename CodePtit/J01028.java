//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J01028 {
    static ArrayList<Integer> a = new ArrayList<>();
    static int res, cnt;

    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
            i = i + 6;
        }
        return true;
    }

    public static void createPrimeNumbers(int n) {
        int prime[] = new int[100000];
        for (int i = 0; i <= n; i++) prime[i] = 1;
        for (int i = 2; i * i <= n; i++)
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) prime[j] = 0;
            }
        for (int i = 2; i <= n; i++) if (prime[i] == 1) a.add(i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), p = in.nextInt();
        if (p == 2) {
            res = 2 * k;
            if (res > 1e9) res = 0;
        } else if(p==3){
            res = k * 6 - 3;
            if(res > 1e9) res = 0;
        } else if (!isPrime(p)) res = 0;
        else {
            if (p > 31607) {
                if (k == 1) res = p;
                else res = 0;
            } else {
                createPrimeNumbers((int) Math.sqrt(1e9));
                int i = 0;
                while (a.get(i) < p) i++;
                cnt = 0;
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                pq.add(p);
                while (true) {
                    p = pq.poll();
                    if (p > 1e9) {
                        res = 0;
                        break;
                    }
                    cnt++;
                    if (cnt == k) {
                        res = p;
                        break;
                    }
                    for (int j = i; j < a.size(); j++) {
                        long tmp = p;
                        tmp *= a.get(j);
                        if (tmp > 1e9) break;
                        else pq.add((int) tmp);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
