import java.util.ArrayList;
import java.util.Collections;

public class CollectionComprato {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(45);
        obj.add(4);
        obj.add(7);
        obj.add(1);
        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(obj);
    }
    
}
