package logic;

import model.Employee;
import model.FullTimeStaff;
import model.PartTimeStaff;
import java.util.List;

public class PayrollProcessor {

    // Run payroll for a list of employees
    public void runPayroll(List<Employee> staffList) {

        // Loop through all employees
        for(Employee emp : staffList) {

            // Polymorphism: calls the correct computeNetPay()
            double pay = emp.computeNetPay();

            // Display result
            System.out.println(emp.getName() + " Net Pay: " + pay);
        }
    }
}
            System.out.println(emp.getName() + " Pay: " + pay);
        }
    }
}
