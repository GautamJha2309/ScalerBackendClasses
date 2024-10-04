package Static;


public class Client {
    public static void main(String[] args) {
        Student st1 = new Student(24, 2020);
        Student st2 = new Student(25, 2020);
        Student st3 = new Student(26, 2020);
        Student st4 = new Student(23, 2023);
        Student st5 = new Student(24, 2021);
        Student st6 = new Student(24, 2022);

        //Static member of a class can be accessed directly by its class name
        // because it is variable associated by the class not by any object.
        System.out.println(Student.countStudent);
        System.out.println();
    }
}
