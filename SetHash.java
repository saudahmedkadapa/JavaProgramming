import java.util.HashSet;
import java.util.TreeSet;

public class SetHash {
    public static void main(String[] args) {
        HashSet <Integer> obj = new HashSet<Integer>();
        obj.add(1);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(3);
        System.out.println(obj);

        TreeSet <Integer> nm = new TreeSet<>();
        nm.add(10);
        nm.add(11);
        nm.add(2);
        nm.add(7);
        nm.add(1);
        nm.add(100);
        System.out.println(nm);
      
    }
    
}
