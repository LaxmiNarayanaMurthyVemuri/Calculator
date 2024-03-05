public class Main {
    Calculator calculator = new Calculator();
    // Your code for testing the remaining methods goes here
    public int power(int a,int b){
        int ans=a;
        for(int i=0;i<b;i++){
            ans=ans*a;
        }
        return ans;
    }
}

