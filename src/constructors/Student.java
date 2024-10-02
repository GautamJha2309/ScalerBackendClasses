package constructors;

public class Student {
    private int age;
    private  int gradYear;
    private String name;

    Student() {
        age = 25;
        gradYear = 2022;
        name = "Gautam";
    }

//    This constructor takes param as input
    Student (int age, int gradYear, String name) {
        // Here "This" will be referring to the Object which is calling the function
        // if the variable and field names are same, we can distinguish them using "This" operators
        // With "This" operator you cannot be able to refer to the variable
        this.age = age;
        this.gradYear = gradYear;
        this.name = name;
    }

//    Constructor taking another Constructor as input param
    Student(Student other) {
        this.age = other.age;
        this.name = other.name;
        this.gradYear = other.gradYear;
    }

//    Following are the Getter Setter for the above private fields
    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
