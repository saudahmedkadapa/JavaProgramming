import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String>obj=new HashMap<>();
        obj.put(45, "Saud");
        obj.put(55, "Ahmed");
       System.out.println(obj.containsKey(65));
        System.out.println(obj);
    }
    
}
