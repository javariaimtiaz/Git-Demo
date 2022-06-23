/**
 * Represents a simple calculator
 */
public class Calculator {

    /**
     * Sums 2 numbers
     * @param a The first number
     * @param b The second number
     * @return The sum of 2 numbers
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts 2 numbers
     * @param a The first number
     * @param b The second number
     * @return The difference of 2 numbers
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies 2 numbers
     * @param a The first number
     * @param b The second number
     * @return The product of 2 numbers
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    public double mul(double a, double b) {
        return a * b;
    }

    /**
     * Divides 2 numbers
     * @param a The first number
     * @param b The second number
     * @return The quotient of 2 numbers
     */
    public double divide(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero!");
        return a / b;
    }

}