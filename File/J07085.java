package File;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {
    static boolean isDigit(char c) {
        if (c >= '0' && c <= '9') return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            String num = "";
            int sum = 0;
            for (int i = 0; i < s.length(); i++)
                if (isDigit(s.charAt(i))) {
                    num += s.charAt(i);
                    sum += s.charAt(i) - '0';
                }
            BigInteger ans = new BigInteger(num);
            System.out.println(ans + " " + sum);
        }
    }
}
