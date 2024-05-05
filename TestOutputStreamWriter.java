import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestOutputStreamWriter {
  public static void main(String args[]) {

    String data = "This is an example of OutputStreamWriter.";

    try {
      // Creates a FileOutputStream
      FileOutputStream file = new FileOutputStream("D:\\testout.txt");

      // Creates an OutputStreamWriter
      OutputStreamWriter output = new OutputStreamWriter(file);

      // Writes string to the file
      output.write(data);
      // Returns the character encoding of the output stream
      System.out.println("Character encoding of output: " + output.getEncoding());

      // Closes the writer
      output.close();
    }

    catch (IOException e) {
      e.getStackTrace();
    }
  }
}