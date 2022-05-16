//Created by Khanh Nguyen Van

package J04020;

import java.util.*;

public class Pair {
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public boolean isPrime() {
        if (prime(this.first) && prime(this.second)) return true;
        return false;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
