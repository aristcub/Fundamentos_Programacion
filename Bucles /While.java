import java.util.*;
public class While{
    public static void main(String[] args){
        /**int i = 5;
        while(i<=100){
        System.out.println(i);
        i+=5;
        }**/

        //ejercicio2
        /**System.out.println("Ingrese un entero no negativo");
        System.out.println("o un entero negativo para parar");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num > 0){
        System.out.println("Ingrese un entero no negativo");
        System.out.println("o un entero negativo para parar:");
        num = scan.nextInt();**/

        /**System.out.println("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cont = 0;
        while(num != 0){
        cont += num; 
        System.out.println(cont);
        System.out.println("Ingrese un numero");
        System.out.println("o el cero para parar");
           num = scan.nextInt();
        }**/
        Scanner scan = new Scanner(System.in);
        String op = "";
        while(!op.equals("salir")){
            System.out.println("Ingresa una operacion (suma, resta, cuadrado o salir):");
            op = scan.next();
            int a = 0;
            int b = 0;
            switch(op){
                case "sumaa":
                System.out.println("Por favor inserte los dos");
                System.out.println("numeros que quiera sumar:");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println("El resultado es: " + (a+b));
                break;

                case "resta":
                System.out.println("Por favor inserte los dos");
                System.out.println("numeros que quiera restar:");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println("El resultado es " + (a-b));
                break;

                case "cuadrado":
                System.out.println("Por favor ingrese el numero");
                System.out.println("que quiera elevar al cuadrado: ");
                a = scan.nextInt();
                System.out.println("" + (a*a));
                break;

                default:
                System.out.println("Operacion incorrecta.");
            }
        }
    }
}