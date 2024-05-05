import java.time.LocalDate;
import java.time.LocalDateTime;

public class Date1 {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println(obj);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        Calender c =Calender.getInstance();
        System.out.println("The current Date is = "+c.getTime());


    }
    
}
