import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {


        //<---- Creating File ---->//

        File myFile = new File("File.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }




        // ----Writing into the File-----//

        try {
            FileWriter fw =new FileWriter("File.txt");
            fw.write("This is our first file from this java course");
            fw.close();
        } catch (IOException e) {
           
            e.printStackTrace();
        }


    }


    // -------Reading a File------ //

    

    
    try {
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine())
    {
        String line =sc.nextLine();
        System.out.println(line);

    }
    sc.close();
    } catch (FileNotFoundException e) {
       
        e.printStackTrace();
    }



// -----Deleting a File------//

    File myFile = new File("File.txt");
    if(myFile.delete()){
        System.out.println("I have deleted : "+ myFile.getName());


    }
    else
    {
        System.out.println("Some Error occurred While deleting the file");
    }
    




}
}
