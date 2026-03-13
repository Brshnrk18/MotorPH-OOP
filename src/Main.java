import model.FullTimeStaff;
import model.PartTimeStaff;
import model.Employee;

public class Main {
    public static void main(String[] args){

        // Test Employee
        Employee emp1 = new Employee("Alice",1001);
        emp1.setHourlyRate(200);
        emp1.setHoursWorked(8);
        System.out.println(emp1.getName() + " Gross Pay: " + emp1.computeGross());

        // Test FullTimeStaff
        FullTimeStaff emp2 = new FullTimeStaff("Bob",1002,30000);
        System.out.println(emp2.getName() + " Monthly Salary: " + emp2.calculatePay());

        // Test PartTimeStaff
        PartTimeStaff emp3 = new PartTimeStaff("Charlie",1003,150);
        double hoursWorked = 10;
        System.out.println(emp3.getName() + " Part-Time Pay: " + emp3.calculatePay(hoursWorked));
    }
}
