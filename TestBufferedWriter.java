import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedInputStream;

public class TestBufferedWriter {
  public static void main(String args[]) {

    String data = "This is the example of Buffer writer .";

    try {
      // Creates a FileWriter
      FileWriter file = new FileWriter("D:\\testout.txt");

      // Creates a BufferedWriter
      BufferedWriter output = new BufferedWriter(file);

      // Writes the string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}