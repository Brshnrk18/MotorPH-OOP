package model;

public class FullTimeStaff extends Employee {
    private double monthlySalary;

    public FullTimeStaff(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    public double computeNetPay() {
        double gross = monthlySalary + 500; // Fixed allowance
        SSS sss = new SSS();
        PhilHealth phil = new PhilHealth();
        PagIBIG pag = new PagIBIG();

        double deductions = sss.calculate(gross) + phil.calculate(gross) + pag.calculate(gross);
        return gross - deductions;
    }
}
