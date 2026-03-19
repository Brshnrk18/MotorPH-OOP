package model;

public class FullTimeStaff extends Employee {

    private double salary;

    public FullTimeStaff(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public double computeNetPay() {
        double gross = salary + 500;

        SSS sss = new SSS();
        PhilHealth phil = new PhilHealth();
        PagIBIG pag = new PagIBIG();

        double total = sss.calculate(gross)
                     + phil.calculate(gross)
                     + pag.calculate(gross);

        return gross - total;
    }
}
