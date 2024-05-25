import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileIo1 {
    public static void main(String[] args) {
        try {
            FileInputStream pbj=new FileInputStream("demo.txt");
            int i=0;
            while ((i=pbj.read())!=-1) {
                System.out.print((char)i);
                
            }
            pbj.close();
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        

        
    }
    
}
