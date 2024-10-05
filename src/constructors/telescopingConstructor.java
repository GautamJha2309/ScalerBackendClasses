package constructors;

public class telescopingConstructor {
    private int a;
    private int b;
    private int c;

    // This is an example of telescopic constructor
    public telescopingConstructor() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        System.out.println("No parameter constructor initialized");
    }

    public telescopingConstructor(int a) {
        this();
        this.a = a;
        System.out.println("1 parameter constructor initialized");
    }

    public telescopingConstructor(int a, int b) {
        this(a);
        this.b = b;
        System.out.println("2 parameter constructor initialized");
    }

    public telescopingConstructor(int a, int b, int c) {
        this(a,b);
        this.c = c;
        System.out.println("3 parameter constructor initialized");
    }
}
