package mypackage;

interface PetAnimal
{
    void run();

    void eat();
}

class Dog implements PetAnimal
{
    public void run()
    {
        System.out.println("This animal is running");
    }

    public void eat()
    {
        System.out.println("This animal is eating");
    }
}

public class PetAnimalExample
{
    public static void main(String[] args)
    {
        Dog d = new Dog();

        d.run();
        d.eat();
    }
}