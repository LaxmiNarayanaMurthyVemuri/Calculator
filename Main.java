import javax.naming.spi.DirStateFactory.Result;

public class Main {
    // Your code for testing the remaining methods goes here
public static void main(String[] args) {
   
    Calculator calculator = new Calculator();
    int a= calculator.add(2,3);
    System.out.println(a);
    
   int ans=calculator.findFloor(5.8);
    System.out.println(ans);

    int result=calculator.multiply(2,3);
    System.out.println(result);
}

}
   

