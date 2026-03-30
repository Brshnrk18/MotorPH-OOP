package logic;

import javax.swing.*;
import java.awt.*;
import model.*;

/**
 * MotorPH Payroll System - Final Refactored GUI
 * Role: View Layer (Input/Output only)
 */
public class PayrollGUI extends JFrame {
    private final JTextField txtName, txtRate, txtHours;
    private final JLabel lblResult;
    private final JButton btnCompute;
    private final PayrollProcessor processor = new PayrollProcessor();

    public PayrollGUI() {
        // Window Setup
        setTitle("MotorPH Payroll System - OOP Final");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10));

        // UI Components
        add(new JLabel(" Employee Name:"));
        txtName = new JTextField(); add(txtName);

        add(new JLabel(" Rate (Monthly or Hourly):"));
        txtRate = new JTextField(); add(txtRate);

        add(new JLabel(" Hours Worked:"));
        txtHours = new JTextField(); add(txtHours);

        add(new JLabel(" Total Net Pay:"));
        lblResult = new JLabel("₱0.00");
        lblResult.setFont(new Font("Arial", Font.BOLD, 14));
        lblResult.setForeground(Color.BLUE);
        add(lblResult);

        add(new JLabel("")); 
        btnCompute = new JButton("Calculate Salary");
        add(btnCompute);

        // Event Listener - Triggers the OOP workflow
        btnCompute.addActionListener(e -> calculate());
    }

    private void calculate() {
        try {
            // 1. Read Inputs
            String name = txtName.getText();
            double rate = Double.parseDouble(txtRate.getText());
            double hours = Double.parseDouble(txtHours.getText());

            // 2. Instantiate correct Subclass (Polymorphism)
            Employee emp;
            // Logic: High rate = Monthly Salary (FullTime), Low rate = Hourly (PartTime)
            if (rate > 5000) {
                emp = new FullTimeStaff(name, 1001, rate);
            } else {
                emp = new PartTimeStaff(name, 1001, rate, hours);
            }

            // 3. Send to Processor and receive results
            double netPay = processor.calculateNetValue(emp);

            // 4. Display Results
            lblResult.setText("₱" + String.format("%.2f", netPay));

        } catch (NumberFormatException ex) {
            // QA Validation: Handles non-numeric inputs
            JOptionPane.showMessageDialog(this, 
                "Input Error: Please enter valid numbers for Rate and Hours.", 
                "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
