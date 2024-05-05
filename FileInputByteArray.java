import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputByteArray {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\File.txt\\engine.file\\testout.txt");
        FileOutputStream fos = new FileOutputStream(f);
        byte b[] = { 'S', 'a', 'u', 'd' };
        fos.write(b);
        fos.close();

    }

}
