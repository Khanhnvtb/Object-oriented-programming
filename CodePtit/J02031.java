//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J02031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int step = 0, minIndex, size = 0;
        int res[] = new int[10000];
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[minIndex]) minIndex = j;
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
            for (int j = 0; j < n; j++) res[size++] = a[j];
            step++;
        }
        for (int i = size - n; i >= 0; i -= n) {
            System.out.print("Buoc " + step-- + ": ");
            for (int j = i; j < i + n; j++)
                System.out.print(res[j] + " ");
            System.out.println();
        }
    }
}
