import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferIo {
    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            int i=0;
            while((i=fis.read())!=-1)
            {
                System.out.print((char)i);
            }
            fis.close();
            bis.close();


            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
       
    }
    
}
