package IntroToOOPs;

public class Student {
    public String name;
    String batch;
    int gradYear;
    double psp;

//    Access Modifier
//    public : can be access anywhere, least secure.
//    protected : Within the class, Within the package / folder and Within the child class anywhere.
//    default : Within the class and Within the folder.
//    private : Within the class only and can be access using getter and setter public method / function.


    public void attendClass() {
        System.out.println("Student " + name + " is attending class.");
    }
}
