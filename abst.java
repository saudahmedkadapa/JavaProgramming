

abstract class animal {
    abstract void walk() ;

}

    class Horse extends animal {
        public void walk() {
            System.out.println("Walks on the 4 legs");
        }
    }

    class chiken extends animal {
        public void walk() {
            System.out.println("Walks on the keg 2");
        }
    }


public class abst {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();

    }

}
