package Static;

public class Student {
    private int id;
    private int age;
    private int gradYear;
    static int countStudent = 0; // It's a static variable which is not associated to any object. It is Associated to the class.
    private int count = 0;

    public Student(int age, int gradYear) {
        countStudent++;
        this.count++;
        this.id = countStudent;
        this.age = age;
        this.gradYear = gradYear;
    }

    //This method will be associated to the object not to the class. so it will give the same output everytime.
    public int getCountStudent() {
        // In not-static method you can access static variables / members
        return countStudent;
    }

    public static int doSomthing() {
        // In Static method you can't access non-static.
        // Because here it will be ambiguous that which age you want to access.
        //this.age = 27;
        //gradYear = 28;
        return countStudent; 
    }
}
