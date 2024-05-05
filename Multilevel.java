// Multilevel Inheritance
class grandfather {
    void bike()

    {
        System.out.println("Hero");
    }

}

class father extends grandfather {
    void car() {
        System.out.println("BMW");
    }

}

class son extends father {
    void cycle() {
        System.out.println("Atlas");
    }

}

public class Multilevel {
    public static void main(String[] args) {
        son s = new son();
        s.bike();
        s.car();
        s.cycle();

    }

}
