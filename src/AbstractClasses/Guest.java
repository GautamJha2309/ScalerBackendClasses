package AbstractClasses;

public class Guest extends User {

    private String useCase;

    @Override
    public void addProfile() {
        System.out.println("Adding Guest Profile...");
    }
}
