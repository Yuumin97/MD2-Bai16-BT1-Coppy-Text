
import java.io.*;

public class Copy {
    public static void main(String[] args)
            throws IOException
    {
        FileInputStream source = null;
        FileOutputStream target = null;

        try {

            source = new FileInputStream(
                    "D:\\MD2\\Bai16\\BT1\\BT1\\src\\source file.txt");

            target = new FileOutputStream(
                    "D:\\MD2\\Bai16\\BT1\\BT1\\src\\target file.txt");

            int c;
            while ((c = source.read()) != -1) {
                target.write(c);
            }
            System.out.println("Đã copy thành công");
        }
        finally {
            if (source != null) {
                source.close();
            }
            if (target != null) {
                target.close();
            }
        }
    }
}