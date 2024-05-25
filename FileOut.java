import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOut {
    public static void main(String[] args) {
        try {
            FileOutputStream obj=new FileOutputStream("demo.txt");
            BufferedOutputStream bos=new BufferedOutputStream(obj);
            String s="Saud ahmed kadapa Cdac";
            byte b[]=s.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            obj.close();




        } catch (Exception e) {
            
            e.printStackTrace();
        }

    }
    
}
