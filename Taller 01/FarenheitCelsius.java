import java.util.*;
public class FarenheitCelsius{
    public static void main(String[] args){
       float c,f;
       Scanner scan = new Scanner(System.in);
       System.out.println("Bienvenido, este programa hara la");
       System.out.println("conversion de cualquier temperatura");
       System.out.println("de grados farenheit a celsius.");
       System.out.println("Por favor, ingrese la temperatura en");
       System.out.println("farenheit a continuacion: ");
       f = scan.nextFloat();
       c = ((f -32) * 5)/9;
       System.out.println("La temperatura es la siguiente:");
       System.out.printf("%5.1f grados farenheit son %5.1f grados celsius.\n", f , c);
       System.out.println("Muchas gracias, hasta luego");
    }
}