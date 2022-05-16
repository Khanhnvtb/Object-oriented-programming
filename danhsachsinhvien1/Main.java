//Created by Khanhnvtb

package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException, Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> a = (ArrayList<SinhVien>) in.readObject();
        for (SinhVien s : a) System.out.println(s);
    }
}
