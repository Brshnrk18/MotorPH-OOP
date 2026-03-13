package logic;

import model.Employee;
import model.FullTimeStaff;
import model.PartTimeStaff;
import java.util.List;

public class PayrollProcessor {

    // Run payroll for a list of employees
    public void runPayroll(List<Employee> staffList) {

        for(Employee emp : staffList) {

            double pay;

            // Check type and calculate pay
            if(emp instanceof FullTimeStaff){
                FullTimeStaff f = (FullTimeStaff) emp;
                pay = f.calculatePay();
            } else if(emp instanceof PartTimeStaff){
                PartTimeStaff p = (PartTimeStaff) emp;
                // For testing, assume 8 hours worked
                pay = p.calculatePay(8);
            } else {
                // Regular Employee uses computeGross()
                pay = emp.computeGross();
            }

            System.out.println(emp.getName() + " Pay: " + pay);
        }
    }
}
