package model;

public class PartTimeStaff extends Employee {

    private double hourlyRate;

    public PartTimeStaff(String name, int id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    // Override calculatePay() for part-time employees
    public double calculatePay(double hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}
