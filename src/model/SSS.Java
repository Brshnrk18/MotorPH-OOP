package model;

/**
 * SSS Deduction Class
 * Part of the MotorPH OOP Refactor
 */
public class SSS {
    
    // Default SSS contribution rate (4%)
    private final double SSS_RATE = 0.04;

    /**
     * Calculates the SSS deduction based on the gross salary.
     * @param grossSalary The total pay before deductions.
     * @return The amount to be deducted for SSS.
     */
    public double calculate(double grossSalary) {
        return grossSalary * SSS_RATE;
    }
}
