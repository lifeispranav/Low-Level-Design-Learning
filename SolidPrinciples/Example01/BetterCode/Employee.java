package SolidPrinciples.Example01.BetterCode;

public class Employee {

    private final int id;
    private final String name;
    private String address;
    
    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getters
    public int getEmployeeId() {
        return id;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeAddress() {
        return address;
    }

    // Setters
    public void setEmployeeAddress(String address) {
        this.address = address;
    }
    
}
