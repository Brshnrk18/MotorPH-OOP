package model;

public abstract class Deduction {
    protected double amount;

    public Deduction() {
        this.amount = 0;
    }

    public abstract double calculate(double salary);

    public double getAmount() {
        return amount;
    }
}
