//Created by Khanh Nguyen Van

package CodePtit;

import java.util.*;

public class J03029 {
    public static boolean isPunctuation(char c) {
        if (c != '.' && c != '!' && c != '?') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] s = in.nextLine().toLowerCase().split("\\s+");
            System.out.print(s[0].toUpperCase().charAt(0));
            for (int i = 1; i < s[0].length(); i++) System.out.print(s[0].toLowerCase().charAt(i));
            System.out.print(" ");
            for (int i = 1; i < s.length; i++) {
                if (i == s.length - 1 && !isPunctuation(s[i].charAt(s[i].length() - 1)))
                    System.out.print(s[i].toLowerCase() + ".");
                else if (i == s.length - 2 && isPunctuation(s[i + 1].charAt(0))) {
                    System.out.print(s[i].toLowerCase() + s[i + 1]);
                    break;
                } else System.out.print(s[i].toLowerCase() + " ");
            }
            System.out.println();
        }
    }
}
