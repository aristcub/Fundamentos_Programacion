import java.util.Scanner;
public class Busqueda{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        int [] arr_edades = {50,20,30,10,40};
        int pos = -1;
        int buscar = 30;
        for(int i = 0; i<arr_edades.length; i++){
            if(buscar== arr_edades[i]){
                pos = i;
                break;
            }
        }
    }
}