import java.util.*;
public class Razon{
    public static void main(String[] args){
       double r , h , s;
       Scanner scan = new Scanner(System.in);
       System.out.println("Bienvenido, por favor elija un valor para r:");
       r = scan.nextDouble();
       System.out.println("Ahora por favor elija un valor para h:");   
       h = scan.nextDouble();
       s = r * Math.PI * (Math.sqrt(Math.pow(r,2)+Math.pow(h,2)));
       System.out.printf("El resultado de la formula con los numeros que ingresaste es %5.2f\n", s);

    }
}