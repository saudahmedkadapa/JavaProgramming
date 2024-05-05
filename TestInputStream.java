
import java.io.*;

public class TestInputStream {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\test.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);

            }
            fin.close();
        } catch (IOException e) {
            System.out.println(e);

        }

    }
}
