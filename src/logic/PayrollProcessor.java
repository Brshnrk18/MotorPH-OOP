package logic;

import model.Employee;

public class PayrollProcessor {

    public double calculateNetValue(Employee emp) {
        double gross = emp.computeGross();
        double sss = emp.calculateSSS();
        double phil = emp.calculatePhilHealth();
        double pag = emp.calculatePagIBIG();
        double net = emp.computeNetPay();

        System.out.println("\n--- QA Internal Trace ---");
        System.out.println("Employee: " + emp.getName() + " (" + emp.getClass().getSimpleName() + ")");
        System.out.printf("Gross: %.2f | SSS: %.2f | PhilHealth: %.2f | Pag-IBIG: %.2f\n", 
                          gross, sss, phil, pag);
        System.out.printf("Calculated Net: %.2f\n", net);
        System.out.println("--------------------------");

        return net;
    }
}
