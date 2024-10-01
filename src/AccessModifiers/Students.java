package AccessModifiers;

public class Students {
    public String name;
    protected String batch;
    private double psp;
    int gradYear;

//    creating a getter - setter for psp as it is a private variable so, we can access via GETTER and  SETTER
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }

    void attendClass() {
        System.out.println("Student " + name + " is attending class.");
    }
}
