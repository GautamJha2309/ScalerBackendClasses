package Polymorphism;

public class Client {
    public static void main(String[] args) {
        User u = new User();
        // When child class object is created, parent class constructor is called
        Student st = new Student();
        Instructor i = new Instructor();

        User u1 = new Instructor();
        // subject is property specific to Instructor, it is not common.
        // In above type of object only common objects are accessible
        //System.out.println(u1.subject);

        // Below is the common method the above class, so it will work
        System.out.println(u1.getPassword());

        UserUtility.changePassword(u);
        UserUtility.changePassword(st);
        UserUtility.changePassword(i);

        System.out.println();
    }
}
