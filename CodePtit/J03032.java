//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String words[] = in.nextLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                for (int j = words[i].length() - 1; j >= 0; j--)
                    System.out.print(words[i].charAt(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
