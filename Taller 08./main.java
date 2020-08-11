import java.util.*;
public class main{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero mayor a 100");
        int n = scan.nextInt();
        persona [] personas = new persona[n];
        for(int i=0; i<n; i++){
          personas[i]=new persona(scan.next());  
        }
        
        for(int i=0; i<100; i++){
          double max = 100;
          double min = 1;
          System.out.println(Math.random()*((min-(max+1)))+max); 
        }
    }
}