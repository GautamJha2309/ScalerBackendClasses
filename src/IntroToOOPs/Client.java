package IntroToOOPs;


public class Client {
    public static void main(String[] args) {
        //Creating a new object of Student class
        Student s = new Student();
        s.name = "Mohit";
        s.batch = "Jan2024";
        s.gradYear = 2022;
        s.psp = 100.0;

        s.attendClass();

        //Creating another new object of Student class
        Student t = new Student();
        t.name = "Gautam";
        t.batch = "Dec2023";

        t.attendClass();

        //Creating a new object but this time is reference object which refers to a new object
        Student usr;
        usr = s;
        usr.batch = "Dec2022";

        usr.attendClass();
    }
}
