//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine().trim();
            String[] word = s.toLowerCase().split("\\s+");
            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i].toUpperCase().charAt(0));
                for (int j = 1; j < word[i].length(); j++)
                    System.out.print(word[i].charAt(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
