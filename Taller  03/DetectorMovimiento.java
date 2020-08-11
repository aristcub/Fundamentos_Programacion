import java.util.*;
public class DetectorMovimiento{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la diferencia ");
        int diferencia = read.nextInt();
        if(diferencia>0){
            System.out.println("Avanza.");
        }else{
            if(diferencia<0){
                System.out.println("Retrocede");
            }else{
                System.out.println("Detenido");
            }
        }
    }
}