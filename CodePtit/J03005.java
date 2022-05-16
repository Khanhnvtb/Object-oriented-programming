//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine().trim();
            String[] word = s.split("\\s+");
            for (int i = 1; i < word.length; i++) {
                System.out.print(word[i].toUpperCase().charAt(0));
                for (int j = 1; j < word[i].length(); j++)
                    System.out.print(word[i].toLowerCase().charAt(j));
                if (i == word.length - 1) System.out.print(", ");
                else System.out.print(" ");
            }
            for (int i = 0; i < word[0].length(); i++)
                System.out.print(word[0].toUpperCase().charAt(i));
            System.out.println();
        }
    }
}
