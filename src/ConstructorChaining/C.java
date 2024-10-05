package ConstructorChaining;

public class C extends B {

    public C() {
        // It has to be the first line
        super(5,8);
        // The below code will not work because the constructor can be called only once
        //super(8);
        System.out.println("Class C constructor is called");
        // We cannot initialize our constructor before parent constructor is called. So the below code will not work
        // Always initialize the parent constructor at the starting.
        //super(5);
    }
}
