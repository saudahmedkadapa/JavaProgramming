//Single level inheritance
class parent {
    void bike() {
        System.out.println("Hero");
    }

}

class child extends parent {
    void cycle() {
        System.out.println("Atlas");
    }

}

public class Single {
    public static void main(String[] args) {
        child c = new child();
        c.bike();
        c.cycle();

    }

}
