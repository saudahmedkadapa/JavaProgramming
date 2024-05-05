import java.io.FileInputStream;

public class FileINput1 {
  public static void main(String args[])throws ExceptionIO {
    try {
      FileInputStream fin = new FileInputStream("D:\\testout.txt");
      int i = fin.read();
      System.out.print((char) i);

      fin.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}