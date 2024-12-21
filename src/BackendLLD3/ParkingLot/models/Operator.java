package BackendLLD3.ParkingLot.models;

public class Operator extends BaseModel{
    private int id;
    private String operatorName;
    private String empId;

    public Operator(int id, String operatorName, String empId) {
        this.operatorName = operatorName;
        this.empId = empId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
