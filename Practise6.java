class animal
{
    public void animalSound()

    {
        System.out.println("Animal Eat  a non-veg");


    }

}
class Dog extends animal
{
    public void animalSound()
    {
        super.animalSound();
        System.out.println("Dog !bow boe");
    }
}



public class Practise6 {
    public static void main(String[] args) {
        animal myDog=new Dog();
        myDog.animalSound();
    }
    
}
