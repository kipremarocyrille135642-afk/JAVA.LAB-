interface Animal
{
    void makeSound();

    void eat();
}

class Dog implements Animal
{
    public void makeSound()
    {
        System.out.println("WOLF!");
    }

    public void eat()
    {
        System.out.println("Dog is eating dog food.");
    }
}

class Cat implements Animal
{
    public void makeSound()
    {
        System.out.println("MEOW!");
    }

    public void eat()
    {
        System.out.println("Cat is eating cat food.");
    }
}

public class InterfaceEX
{
    public static void main(String[] args)
    {
        // Create instance of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("Dog:");
        dog.makeSound();
        dog.eat();

        System.out.println("\nCat:");
        cat.makeSound();
        cat.eat();
    }
}
