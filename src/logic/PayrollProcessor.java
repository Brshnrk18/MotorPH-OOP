package logic;

import model.Employee;
import java.util.List;

public class PayrollProcessor {

    public void runPayroll(List<Employee> staffList) {

        for(Employee emp : staffList) {
            double pay = emp.computeNetPay();
            System.out.println(emp.getName() + " Net Pay: " + pay);
        }
    }
}
