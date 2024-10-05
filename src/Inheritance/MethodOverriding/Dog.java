package Inheritance.MethodOverriding;

public class Dog extends Animal{

    public void makeSound() {
        super.makeSound(); // It will initialize the parent method first
        System.out.println("Bhau Bhau Bhau Bhau");
    }

    // Cannot change the returnType of parent class.
    // It should have same returnType or compatible returnType
    // (Example: If parent is returning Animal then Child can return Dog)
//    public String makeSound() {
//        return "Bhau Bhau Bhau Bhau";
//    }

    public void eat() {
        System.out.println("Roti dedo Bhaiya..!");
    }
}
