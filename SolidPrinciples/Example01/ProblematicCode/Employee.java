package SolidPrinciples.Example01.ProblematicCode;

public class Employee {

    private final int id;
    private final String name;
    private String address;
    
    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport() {
        // This method is responsible for printing performance reports (Algos..)
        System.out.println("Printing performance report for employee: " + this.name);
    }

    public double calculateSalary() {
        // This method is responsible for calculating Salaries (Algos..)
        return 1000.0;
    }

    public void updateEmployeeData() {
        // Code to update the Employee's data (Algos..)
        System.out.println("Updating employee data for employee: " + this.name);
    }

    public void fetchEmployeeData() {
        // Code to fetch the Employee's data (Algos..)
        System.out.println("Fetching employee data for employee: " + this.name);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
}