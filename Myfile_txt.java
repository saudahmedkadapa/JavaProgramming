import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Myfile_txt {
    public void main() throws IOException {
        FileInputStream fin = new FileInputStream("my File.txt");
        System.out.println("file Concxept");
        int ch;
        while ((ch = fin.read()) != -1) {
            System.out.println((char) ch);
        }
        fin.close();

    }

}
