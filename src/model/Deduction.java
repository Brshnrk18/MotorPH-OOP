package model;

public abstract class Deduction {

    protected double amount; // store calculated deduction

    public Deduction() {
        this.amount = 0;
    }

    // Abstract method — every subclass must define its own formula
    public abstract double calculate(double salary);

    // Getter
    public double getAmount() {
        return amount;
    }
}
