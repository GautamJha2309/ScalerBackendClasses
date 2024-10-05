package Inheritance;

public class Instructor extends User {
    private String subject;

    Instructor() {
        this.subject = "Academy";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
