import java.util.*;
public class Try {
   public static void main(String[] args){ 
       double c,r;
       Scanner scan = new Scanner(System.in);
       System.out.println("Ingrese el Radio: ");
       r = scan.nextDouble();
       
       c = Math.PI * r * 2;
       System.out.printf("El circulo con radio %5.2f tiene "
        +"una circunferencia %5.2f\n", r, c);
   }
}
