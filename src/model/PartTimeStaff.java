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
@Override
public double computeNetPay() {
    double gross = computeGross(); // hourly * hours

    SSS sss = new SSS();
    PhilHealth phil = new PhilHealth();
    PagIBIG pag = new PagIBIG();

    double sssAmount = sss.calculate(gross);
    double philAmount = phil.calculate(gross);
    double pagAmount = pag.calculate(gross);

    return gross - (sssAmount + philAmount + pagAmount);
}
