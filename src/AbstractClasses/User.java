package AbstractClasses;

public abstract class User {
    private String name;
    private String email;
    private String password;

    public void login() {
        System.out.println("User Successfully logged in...");
    }

    public abstract void addProfile();
}
