//Hierarchical Inheritance.
class Parent {
    void car() {
        System.out.println("Ferrari");
    }

}

class C1 extends Parent {
    void bike() {
        System.out.println("HYBUSA");
    }

}

class C2 extends Parent {
    void cycle() {
        System.out.println("BMW");
    }

}

public class Hierarchical {
    public static void main(String[] args) {
        C1 c = new C1();
        c.car();
        c.bike();

        C2 cz = new C2();
        cz.car();
        cz.cycle();

    }

}
