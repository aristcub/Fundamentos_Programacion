import java.util.Scanner;
public class Edades{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de edades que quiere asignar:");
        System.out.println("Valores validos de 1 a 100:");
        int cant_edades = scan.nextInt();
        int[] arr_edades = new int[cant_edades];
        for(int i=0; i<cant_edades; i++){
            System.out.println("Ingrese el valor de la edad "+(i+1));
            arr_edades[i]=scan.nextInt();;
        }
        for(int i=0; i<cant_edades; i++){
            System.out.println(arr_edades[i]);
        }
    }
}