class Animal 
{
    void sound() 
    {
        System.out.println("Animal makes a sound.");
    }
}


class Dog extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("Dog barks.");
    }
}


class Puppy extends Dog 
{
    @Override
    void sound() 
    {
        System.out.println("Puppy yaps.");
    }
}


class Cat extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("Cat meows.");
    }
}

public class InheritanceDemo 
{
    public static void main(String[] args) 
    {
        
        Animal a;

        
        a = new Dog();
        a.sound();  

        
        a = new Puppy();
        a.sound();  

        
        a = new Cat();
        a.sound();  
    }
