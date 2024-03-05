

public class Main {
    public static void main(String[] args) {
        
        // Your code for testing the remaining methods goes here   
        Calculator calculator = new Calculator();

        // Test for powerof method
        calculator.powerof(2, 3);
        calculator.powerof(0, 0);

        // Test for ceil method
        calculator.ceil(12.5);
        calculator.ceil(10);

        // Test for division method
        calculator.division(6, 2);
        calculator.division(0, 0);

        // Test for sub method
        calculator.sub(3, 4);
        calculator.sub(0, 0);
        
        // Test for SquareRoot method
        calculator.SquareRoot(25);
        calculator.SquareRoot(17);

        // Test for add method
        calculator.add(3, 4);
        calculator.add(2, 0);

        // Test for multiply method
        double[] a = {1, 2, 3, 4};
        calculator.multiply(a);
        calculator.multiply(a);
        
        
    }

}
   


