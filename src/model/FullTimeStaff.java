package model;

public class FullTimeStaff extends Employee {
    private final double monthlySalary;

    public FullTimeStaff(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    public double computeGross() {
        return monthlySalary + 500; // Salary + Fixed Allowance
    }

    @Override
    public double computeNetPay() {
        double gross = computeGross();
        double deductions = calculateSSS() + calculatePhilHealth() + calculatePagIBIG();
        return gross - deductions;
    }
}
