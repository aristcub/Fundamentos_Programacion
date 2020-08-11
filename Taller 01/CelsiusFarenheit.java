import java.util.*;
public class CelsiusFarenheit{
    public static void main(String[] args){
       float c,f;
       Scanner scan = new Scanner(System.in);
       System.out.println("Bienvenido, este programa hara la");
       System.out.println("conversion de cualquier temperatura");
       System.out.println("de grados celsius a farenheit.");
       System.out.println("Por favor, ingrese la temperatura en");
       System.out.println("celsius a continuacion: ");
       c = scan.nextFloat();
       f = (c * 9/5) + 32;
       System.out.println("La temperatura es la siguiente:");
       System.out.printf("%5.1f grados celsius son %5.1f grados Farenheit.\n", c , f);
       System.out.println("Muchas gracias, hasta luego");
    }
}