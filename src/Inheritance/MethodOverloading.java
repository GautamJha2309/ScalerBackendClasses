package Inheritance;

public class MethodOverloading {

    //Method Overloading
    //Method Signature: register()
    public void register() {
        System.out.println("User register is executing");
    }

    //Method Signature: register(String)
    public void register(String email) {
        System.out.println(email);
    }

    //Method Signature: register(String, String)
    public void register(String email, String password) {
        System.out.println("Email: " + email + " Password : " + password);
    }

    //The below code cannot work as the method signature is repeated
    //Method Signature: register(String, String)
//    public void register(String email, String password) {
//        System.out.println("Email: " + email + " Password : " + password);
//    }


    //Method Signature
    // FunctionName (dataType,dataType,dataType,...)

}
