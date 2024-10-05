package Inheritance;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User() {
        this.id = 1;
        this.name = "temp";
        this.email = "temp@gmail.com";
        this.password = "temp";
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void login() {
        System.out.println("User is successfully logged in");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
