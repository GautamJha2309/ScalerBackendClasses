package Polymorphism;

public class Student extends User {
    private String course;

    Student() {
        course = "Scaler Academy";
    }

    public void doSomething() {
        super.login();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
