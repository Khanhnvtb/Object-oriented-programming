package File;

import java.io.File;
import java.util.Scanner;

public class J07078 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            int n = s1.length(), m = s2.length();
            for (int i = 0; i <= n - m; i++)
                if (s1.substring(i, i + m).equals(s2)) System.out.print(i + 1 + " ");
            System.out.println();
        }
    }
}
