import model.Employee;
import model.FullTimeStaff;
import model.PartTimeStaff;
import logic.PayrollProcessor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Create employees
        Employee emp1 = new Employee("Alice",1001);
        emp1.setHourlyRate(200);
        emp1.setHoursWorked(8);

        FullTimeStaff emp2 = new FullTimeStaff("Bob",1002,30000);

        PartTimeStaff emp3 = new PartTimeStaff("Charlie",1003,150);

        // Add them to a list
        List<Employee> allStaff = new ArrayList<>();
        allStaff.add(emp1);
        allStaff.add(emp2);
        allStaff.add(emp3);

        // Run payroll
        PayrollProcessor processor = new PayrollProcessor();
        processor.runPayroll(allStaff);
    }
}
