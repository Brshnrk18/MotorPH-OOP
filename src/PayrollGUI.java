package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*; // This connects to your GitHub OOP classes

public class PayrollGUI extends JFrame {

    // 1. Define UI Components
    private final JTextField txtName;
    private final JTextField txtRate;
    private final JTextField txtHours;
    private final JLabel lblResult;
    private final JButton btnCompute;

    public PayrollGUI() {
        // 2. Setup the Window
        setTitle("MotorPH Payroll System - Manual Refactor");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 10, 10)); // Grid for easy alignment

        // 3. Add Labels and Text Fields
        add(new JLabel(" Employee Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel(" Hourly Rate:"));
        txtRate = new JTextField();
        add(txtRate);

        add(new JLabel(" Hours Worked:"));
        txtHours = new JTextField();
        add(txtHours);

        // 4. Result Display
        add(new JLabel(" Total Net Pay:"));
        lblResult = new JLabel("₱0.00");
        lblResult.setFont(new Font("Arial", Font.BOLD, 14));
        lblResult.setForeground(Color.BLUE);
        add(lblResult);

        // 5. The Compute Button
        btnCompute = new JButton("Calculate Salary");
        add(new JLabel("")); // Empty space for layout
        add(btnCompute);

        // 6. The Action Listener (The Logic)
        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void calculate() {
        try {
            String name = txtName.getText();
            double rate = Double.parseDouble(txtRate.getText());
            double hours = Double.parseDouble(txtHours.getText());

            // Create OOP Object from your 'model' package
            PartTimeStaff emp = new PartTimeStaff(name, 1001, rate, hours);
            
            // This calls your SSS.java, PhilHealth.java math automatically
            double netPay = emp.computeNetPay();

            lblResult.setText("₱" + String.format("%.2f", netPay));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PayrollGUI().setVisible(true);
        });
    }
}