import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStreamReader {
    public static void main(String[] args) throws IOException {

        // Creates an array of character
        char[] store_array = new char[100];

        try {
            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("D:\\ReaderInput.txt");

            // Creates an InputStreamReader
            InputStreamReader input = new InputStreamReader(file);

            // Reads characters from the file
            input.read(store_array);// read byte as a charecter store it into store_array
            System.out.println("Data in the stream:");
            System.out.println(store_array);

            // Closes the reader
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}