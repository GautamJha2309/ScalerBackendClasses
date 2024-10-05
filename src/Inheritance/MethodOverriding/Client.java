package Inheritance.MethodOverriding;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Animal x = new Dog();
        // Here as makeSound() function is  common in both the child and parent (i.e. Dog and Animal) Classes so this code will work.
        // The below code will be associated with object at runtime.
        // First it will check that does parent have the same method or not,
        // if yes then at runtime it gets associated with object as same method is also present at child class as well.
        // So the makeSound() function of child class get executed.
        x.makeSound();

        // As eat is not available in Animal class, so it cannot be accessed by x as it is associated with Animal class.
        // It will at compile time.
        //x.eat();
    }
}
