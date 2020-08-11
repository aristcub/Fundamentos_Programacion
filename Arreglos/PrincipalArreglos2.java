import java.util.Scanner;
public class PrincipalArreglos2{
    
    public static int[] creacionArreglo(int l){
        int[] arr_int = new int[l];
        for(int i = 0; i<l; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el valor de la pocision "+i);
            int aux = scan.nextInt();
            arr_int [i] = aux *2;
        }
        return arr_int;
    }
    
    public static void imprimirArreglo(int [] a){
        /**int[] aux = new int [a.length];
        for(int i = 0; i<a.length; i++){
            aux[i] = a[i]*3;
        }
        for(int i=0; i<aux.length; i++){
            return aux[i];
        }**/
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]*3);
        }
        
    }
    
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el largo del arreglo");
        int i = scan.nextInt();
        int[] array = creacionArreglo(i);
        //System.out.println
        imprimirArreglo(array);
    }

}