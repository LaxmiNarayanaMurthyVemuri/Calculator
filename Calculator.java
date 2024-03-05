class Calculator {
    public double multiply(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double result = 1.0;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }
}
