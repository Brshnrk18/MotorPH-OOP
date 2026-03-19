# MotorPH Payroll System (OOP Refactoring)

## Overview
This project is a refactored version of the MotorPH Payroll System. The original procedural (CP2) logic was converted into an Object-Oriented Programming (OOP) design using Java.

The goal is to create a cleaner, more scalable, and maintainable payroll system using OOP principles such as Encapsulation, Abstraction, Inheritance, and Polymorphism.

---

## Project Structure

src  
 ├── model  
 │    ├── Employee.java  
 │    ├── FullTimeStaff.java  
 │    ├── PartTimeStaff.java  
 │    ├── Deduction.java  
 ├── logic  
 │    └── PayrollProcessor.java  
 └── Main.java  

---

## Step-by-Step Implementation

### Step 1–3: Employee Class
- Created `Employee` as the parent class
- Added shared attributes: name, id, hourlyRate, hoursWorked
- Implemented `computeGross()` for basic salary calculation

---

### Step 4–7: Subclasses
- Created `FullTimeStaff` for fixed salary employees
- Created `PartTimeStaff` for hourly employees
- Used inheritance to avoid repeating code

---

### Step 8–9: PayrollProcessor
- Created `PayrollProcessor` class
- Added a loop to process all employees
- Initially used `instanceof` to calculate pay

---

### Step 10: Deduction System
- Created abstract class `Deduction`
- Added abstract method `calculate()`
- Created subclasses:
  - `SSS`
  - `PhilHealth`
  - `PagIBIG`
- Each class has its own formula

---

### Step 11: computeNetPay()
- Added `computeNetPay()` in `Employee`
- This method:
  - Computes gross pay
  - Applies all deductions
  - Returns final net pay

---

### Step 12: Polymorphism (Final Refactor)
- Overrode `computeNetPay()` in:
  - `FullTimeStaff`
  - `PartTimeStaff`
- Updated `PayrollProcessor` to:

```java
for(Employee emp : staffList) {
    double pay = emp.computeNetPay();
    System.out.println(emp.getName() + " Net Pay: " + pay);
}
