package model;

public class PartTimeStaff extends Employee {
    public PartTimeStaff(String name, int id, double rate, double hours) {
        super(name, id);
        setHourlyRate(rate);
        setHoursWorked(hours);
    }
}
