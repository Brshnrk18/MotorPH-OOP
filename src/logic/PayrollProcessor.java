package logic;

import model.Employee;
import java.util.List;

public class PayrollProcessor {
    public void runPayroll(List<Employee> staffList) {
        System.out.println("--- MotorPH Payroll Report ---");
        for (Employee emp : staffList) {
            double pay = emp.computeNetPay();
            System.out.println("ID: " + emp.getName() + " | Net Pay: " + pay);
        }
    }
}
