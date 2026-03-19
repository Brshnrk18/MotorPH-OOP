package model;

public class FullTimeStaff extends Employee {

    private double salary;

    public FullTimeStaff(String name, int id, double salary){
        super(name,id);
        this.salary = salary;
    }

    public double calculatePay(){
        return salary;
    }
}
Added FullTimeStaff class
@Override
public double computeNetPay() {
    double gross = calculatePay(); // full-time uses salary

    // example allowance
    gross += 500;

    SSS sss = new SSS();
    PhilHealth phil = new PhilHealth();
    PagIBIG pag = new PagIBIG();

    double sssAmount = sss.calculate(gross);
    double philAmount = phil.calculate(gross);
    double pagAmount = pag.calculate(gross);

    return gross - (sssAmount + philAmount + pagAmount);
