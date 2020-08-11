public class recursion{
    public static void main(String [] args){
        //System.out.println(factorial(4));
        
        System.out.println(fibonacci(4));
    }
    
    public static long factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    
    public static int fibonacci(double n){
        int previo1, previo2, ans;
        if(n>1){
           previo1= fibonacci(n-1);
           previo2= fibonacci(n-2);
           ans = previo1 + previo2;
        }else{
         //   ans = n;
        }
        return ans;
    }
    
    
}