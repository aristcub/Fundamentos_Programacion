import java.util.Scanner;
public class Word{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Por favor ingresa la palabra mas "
        + "larga y rara que conozcas");
        String palabra = scan.next();
        System.out.println(palabra.length());
        System.out.println(palabra.indexOf('a'));
    }
}