import model.*;
import logic.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Test Cases
        Employee emp1 = new FullTimeStaff("Broose", 1001, 25000);
        Employee emp2 = new PartTimeStaff("Alice", 1002, 500, 40);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);

        PayrollProcessor processor = new PayrollProcessor();
        processor.runPayroll(list);
    }
}
