import java.text.SimpleDateFormat;
import java.util.Date;
  
public class Calender {
   public static void main(String[] args) {
      Date now = new Date();
 
      SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
      System.out.println("Display:-   " + dateFormatter.format(now));

   }
}