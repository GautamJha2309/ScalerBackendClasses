package ConstructorChaining;

public class B extends A {

    public B() {
        System.out.println("Class B constructor is called");
    }

    B(int a) {
        // Initializing another constructor from here, use "this()" keyword (Initializing constructor with no parameter)
        this(); // This is also known as telescoping constructor
        System.out.println("Constructor B with value a is called : "+ a);
    }

    B(int a, int b) {
        // Initializing another constructor from here, use "this()" keyword (Initializing constructor with 1 parameter)
        this(a); // This is also known as telescoping constructor
        System.out.println("Constructor B with value a is called : "+ a + " and  b : "+ b);
    }

    B(int a, int b, int c) {
        // Initializing another constructor from here, use "this()" keyword (Initializing constructor with 1 parameter)
        this(a, b); // This is also known as telescoping constructor
        System.out.println("Constructor B with value a is called : "+ a + ",  b : "+ b + " and c : " + c);
    }
}
