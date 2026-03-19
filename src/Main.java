import model.*;
import logic.PayrollProcessor;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Employee emp1 = new Employee("Alice",1001);
        emp1.setHourlyRate(200);
        emp1.setHoursWorked(8);

        FullTimeStaff emp2 = new FullTimeStaff("Bob",1002,30000);

        PartTimeStaff emp3 = new PartTimeStaff("Charlie",1003,150,10);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        PayrollProcessor p = new PayrollProcessor();
        p.runPayroll(list);
    }
}
