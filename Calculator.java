class Calculator {

    public int powerof(int a, int b) {
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        return ans;
    }

    public double ceil(double a) {
        return Math.ceil(a);
    }


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
        return ans;
    }
        
    public int findFloor(double num) {
        return (int) num; 

    }


}
