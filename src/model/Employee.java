package model;

public class Employee {
    private String name;
    private int id;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setHourlyRate(double rate) { this.hourlyRate = rate; }
    public void setHoursWorked(double hours) { this.hoursWorked = hours; }

    public double computeGross() {
        return hourlyRate * hoursWorked;
    }

    public double computeNetPay() {
        double gross = computeGross();
        // Initializing deduction objects from the same package
        SSS sss = new SSS();
        PhilHealth phil = new PhilHealth();
        PagIBIG pag = new PagIBIG();

        double totalDeductions = sss.calculate(gross) + phil.calculate(gross) + pag.calculate(gross);
        return gross - totalDeductions;
    }
}
