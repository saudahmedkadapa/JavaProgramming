
abstract class Build {
    abstract void callMe();

    void callMeToo() {
        System.out.println("this is concrete method");
    }

}

class Man extends Build {
    void callMe() {
        System.out.println("B's implementation of callme");
    }
}

class Polymorphism {
    public static void main(String args[]) {

        Man b = new Man();
        b.callMe();
        b.callMe();

    }

}
