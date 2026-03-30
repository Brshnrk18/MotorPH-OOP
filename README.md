# MotorPH Payroll System (OOP Refactor)
**Author:** Broose Henrik Membreve  
**Project:** Milestone 2 - Object-Oriented Implementation  
**Status:** Completed & QA Verified ✅

## 🚀 Project Overview
This project is a complete refactoring of the MotorPH Payroll System. Moving away from the procedural logic of CP1, this version implements a strictly decoupled, **Object-Oriented Architecture** designed for scalability and maintainability.

The system calculates gross pay, government deductions (SSS, PhilHealth, Pag-IBIG), and final net pay through a dedicated logic processor, ensuring that the User Interface remains independent of the business rules.

---

## 🏗️ Architecture & OOP Design
The project is organized into three distinct packages to ensure **Separation of Concerns**:

### 1. Model Layer (`model`)
- **Encapsulation:** All employee data is protected within the `Employee` parent class.
- **Inheritance:** Specialized logic for `FullTimeStaff` (monthly + allowance) and `PartTimeStaff` (hourly) extends the base class.
- **Deduction Strategy:** SSS, PhilHealth, and Pag-IBIG calculations are moved to independent classes to prevent code bloating.

### 2. Logic Layer (`logic`)
- **The Processor:** Acts as the "Engine." It orchestrates the computation sequence without being tied to a specific UI.
- **Decoupling:** The `PayrollProcessor` accepts an `Employee` object and returns results, allowing the GUI to remain "thin."

### 3. View Layer (`main` & `logic.GUI`)
- **Clean Interface:** The GUI handles only user input and data display.
- **Polymorphism:** The system dynamically instantiates the correct subclass based on user input, demonstrating runtime method binding.

---

## 🧪 Testing & Quality Assurance
This version has undergone three phases of rigorous testing:
1. **Internal Smoke Test:** Verified the GUI-to-Backend connection.
2. **Console Trace Debugging:** Monitored variable states and deduction formulas in real-time.
3. **External QA:** Validated by an external tester to ensure edge-case stability (e.g., non-numeric inputs and zero-hour scenarios).

---

## 🛠️ How to Run
1. Clone this repository.
2. Open the project in **NetBeans IDE**.
3. Locate `src/main/Main.java`.
4. Right-click and select **Run File**.

---

## 📝 Final Reflections
By refactoring this system, I have moved from "writing scripts" to "building systems." The use of Polymorphism significantly reduced the need for complex `if-else` chains, making the code cleaner and easier to debug during the Week 11-12 QA cycle.
