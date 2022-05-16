//Created by Khanh Nguyen Van

package CodePtit;

import java.io.*;

public class HELLOFILE {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("Hello.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
    }
}
