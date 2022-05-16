package File;

import java.io.File;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws Exception {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
