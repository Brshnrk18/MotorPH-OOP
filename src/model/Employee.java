package model;

public class Employee {
    private final String name;
    private final int id;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double computeGross() {
        return hourlyRate * hoursWorked;
    }

    public double calculateSSS() {
        return new SSS().calculate(computeGross());
    }

    public double calculatePhilHealth() {
        return new PhilHealth().calculate(computeGross());
    }

    public double calculatePagIBIG() {
        return new PagIBIG().calculate(computeGross());
    }

    public double computeNetPay() {
        double gross = computeGross();
        double deductions = calculateSSS() + calculatePhilHealth() + calculatePagIBIG();
        return gross - deductions;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public void setHourlyRate(double rate) { this.hourlyRate = rate; }
    public void setHoursWorked(double hours) { this.hoursWorked = hours; }
}
