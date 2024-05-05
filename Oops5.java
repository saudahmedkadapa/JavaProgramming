abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("you are creating a new animal");
    }

    public void eat() {
        System.out.println("Animal Eats");
    }

}

class Horse extends Animal {
    Horse() {
        System.out.println("creating a Horse");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Oops5 {
    public static void main(String[] args) {
        Horse horse = new Horse();

    }

}
