package model;

public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    // Step 11: computeNetPay
public double computeNetPay() {
    double gross = computeGross(); // get gross pay

    // create deduction objects
    SSS sss = new SSS();
    PhilHealth phil = new PhilHealth();
    PagIBIG pag = new PagIBIG();

    // calculate each deduction
    double sssAmount = sss.calculate(gross);
    double philAmount = phil.calculate(gross);
    double pagAmount = pag.calculate(gross);

    // subtract deductions from gross
    double netPay = gross - (sssAmount + philAmount + pagAmount);

    return netPay;
}
}
