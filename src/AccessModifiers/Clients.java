package AccessModifiers;


import IntroToOOPs.Student;

public class Clients {
    public static void main(String[] args) {
//        Creating a new object of Student class
        Students s = new Students();
        s.name = "Mohit";
        s.batch = "Jan2024";
        s.gradYear = 2022;
//        psp is a private variable, so it cannot be access outside the class
//        s.psp = 100.0;
        s.setPsp(95.0);

        System.out.println(s.getPsp());
        s.attendClass();

//        Creating another new object of Student class
        Students t = new Students();
        t.name = "Gautam";
        t.batch = "Dec2023";

        t.attendClass();

//        Creating a new object but this time is reference object which refers to a new object
        Students u;
        u= s;
        u.batch = "Dec2022";

        u.attendClass();


//        Refering to the Student class from IntroToOOps package
        Student std = new Student();
        std.name = "Mohit"; //This is a public variable

//        Default variable cannot be access outside the package;
        // std.batch = "Dec2022";
        //std.gradYear = 2022;


        std.attendClass(); // This is a public class
    }
}
