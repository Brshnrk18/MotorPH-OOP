package main;

import logic.PayrollGUI;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PayrollGUI().setVisible(true);
        });
    }
}
