import java.util.*;
public class Ejercicio{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de numeros a ser sumados:");
        int cant = scan.nextInt();
        int sum = 0;
        System.out.println("Ingrese los numeros");
        for(int i = 0; i < cant; i++){
            //System.out.println("Ingrese uno de los numeros");
            sum += scan.nextInt();
        }
        System.out.println("El total de la suma es: "+ sum);
    }
}