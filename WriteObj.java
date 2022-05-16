import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class WriteObj {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("AAAAA");
        a1.add("BBBBB");
        out.writeObject(a1);
        out = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("111");
        a2.add("222");
        out.writeObject(a2);
    }
}
