class Calculator {

    public int division(int a, int b) {
        return a / b;
    }



    public double sub(double a, double b){
        return a - b;
    }

    public double SquareRoot(double n){
      return Math.sqrt(n);
       
    }
    

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
  
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
        
    public int findFloor(double num) {
        return (int) num; 

    }


}
