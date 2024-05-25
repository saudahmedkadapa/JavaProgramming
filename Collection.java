import java.util.HashMap;

public class Collection {
    public static void main(String[] args) {
    HashMap<String,Integer> obj=new HashMap<String,Integer>();
    obj.put("saud", 45);
    obj.put("sohail", 745);
    obj.remove("saud");
    obj.clear();
    System.out.println(obj);
    }
    
}
