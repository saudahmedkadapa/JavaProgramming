import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        // LocalDate obj =  LocalDate.now();
        // System.out.println(obj);

        // LocalDate d = LocalDate.now();
        // LocalTime t= LocalTime.now();
        // LocalDateTime ti =LocalDateTime.now();
        // System.out.println("date=" +d);
        // System.out.println("Time =" +t);
        // System.out.println("Date &Time =" +ti);

        LocalDateTime dt =LocalDateTime.now();
        System.out.println("Before formatting =" +dt);
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        String formattedDate = dt.format(f);
        System.out.println("After Formatting=" +formattedDate);



       
    
    }
    
}