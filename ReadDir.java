import java.io.File;

public class ReadDir {

    public static void main(String[] args) {
        File file_obj = null; // declaring file object and assign null value into it
        String[] paths;

        try {
            // create new file object
            file_obj = new File("D://shankha");

            // array of files and directory
            paths = file_obj.list();

            // for each name in the path array
            for (String path : paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (ArithmeticException e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}