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
