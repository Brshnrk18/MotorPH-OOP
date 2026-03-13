import model.FullTimeStaff;

public class Main {

    public static void main(String[] args){

        FullTimeStaff emp = new FullTimeStaff("John",1001,30000);

        System.out.println("Employee: " + emp.getName());
        System.out.println("Salary: " + emp.calculatePay());

    }

}
Added Main test file
