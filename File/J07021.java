//Created by Khanhnvtb

package File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07021 {
    static String chuanHoa(String s) {
        String str[] = s.split("\\s+");
        String ans = "";
        for (String tmp : str)
            ans += tmp.toUpperCase().charAt(0) + tmp.substring(1).toLowerCase() + " ";
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (in.hasNextLine()) {
            String s = in.nextLine();
            a.add(chuanHoa(s.trim()));
        }
        for (int i = 0; i < a.size() - 1; i++)
            System.out.println(a.get(i));
    }
}
