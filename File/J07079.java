package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class J07079 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            String num = "";
            for (int j = 0; j < s.length(); j++)
                if (s.charAt(j) == '0' || s.charAt(j) == '1') num += s.charAt(j);
            int cnt = 0;
            long res = 0;
            for (int i = num.length() - 1; i >= 0; i--) {
                res += (num.charAt(i) - '0') * Math.pow(2, cnt++);
            }
            System.out.println(num + " " + res);
        }
    }
}
