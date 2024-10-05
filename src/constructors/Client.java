package constructors;


public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getGradYear());

//        Copy Constructor
//        I. Copy by Reference
        Student s1;
        s1 = s;

//        II. Actual Copy
        Student s2;
        s2 = new Student();
        s2.setName(s.getName());
        s2.setAge(s1.getAge());
        s2.setGradYear(s1.getGradYear());

//        III. Deep Copy
        Student s3 = new Student(s);
        System.out.println(s3.getGradYear());

//          IV. Telescopic Constructor
        telescopingConstructor tc = new telescopingConstructor(5, 4, 3);

    }
}
