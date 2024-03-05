public class Main {
    Calculator calculator = new Calculator();
    // Your code for testing the remaining methods goes here
    public void testMultiplication() {
        // Test case 1: Basic multiplication
        double result1 = calculator.multiply(2, 3);
        System.out.println("Test Case 1: 2 * 3 = " + result1);
        assert result1 == 6.0;

        // Test case 2: Multiplication with zero
        double result2 = calculator.multiply(5, 0);
        System.out.println("Test Case 2: 5 * 0 = " + result2);
        assert result2 == 0.0;

        // Test case 3: Multiplication with negative numbers
        double result3 = calculator.multiply(-4, 2, -3);
        System.out.println("Test Case 3: (-4) * 2 * (-3) = " + result3);
        assert result3 == 24.0;
}
public static void main(String[] args) {
    Main main = new Main();
    main.testMultiplication();
}
}

