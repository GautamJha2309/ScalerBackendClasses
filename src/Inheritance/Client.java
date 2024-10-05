package Inheritance;

public class Client {
    public static void main(String[] args) {
        User u = new User();

        // When child class object is created, parent class constructor is called
        Student st = new Student();
        Instructor i = new Instructor();

        System.out.println();
    }
}
