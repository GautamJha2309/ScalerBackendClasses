package AbstractClasses;

public class Student extends User {

    private String batch;

    void attendClass() {
        System.out.println("Attending class...");
    }

    @Override
    public void addProfile() {
        System.out.println("Adding Student Profile...");
    }
}


// Interfaces can be implemented in abstract class.
// If you implement interface in abstract class and not implemented the interface methods then
// the child class is responsible to implement that.
// If the interface methods is not implemented in parent class then the issue will be reflected in child class.
// and if implemented in parent class then its already can be used by child class itself.