class Calculator {
MultiUpdated
    public double multiply(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double result = 1.0;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    public int findFloor(double num) {
        return (int) num; 
    }
}

