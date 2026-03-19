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
    public int getId() { return id; }

    public void setHourlyRate(double rate) {
        if(rate > 0) this.hourlyRate = rate;
    }

    public void setHoursWorked(double hours) {
        if(hours >= 0) this.hoursWorked = hours;
    }

    public double computeGross() {
        return hourlyRate * hoursWorked;
    }

    public double computeNetPay() {
        double gross = computeGross();

        SSS sss = new SSS();
        PhilHealth phil = new PhilHealth();
        PagIBIG pag = new PagIBIG();

        double totalDeduction =
            sss.calculate(gross) +
            phil.calculate(gross) +
            pag.calculate(gross);

        return gross - totalDeduction;
    }
}
