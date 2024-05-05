import java.io.FileInputStream;
import java.io.IOException;

public class DisplayFile {
    public static void main() throws IOException {
        {
            FileInputStream fin = new FileInputStream("myfile.txt");
            System.out.println("File Concept");
            int ch;
            while ((ch = fin.read()) != -1)
                System.out.println((char) ch);
            fin.close();
        }

    }
}