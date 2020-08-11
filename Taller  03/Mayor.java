import java.util.*;
public class Mayor{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        int a = read.nextInt();
        System.out.println("Ingrese el segundo valor:");
        int b = read.nextInt();
        boolean mayor;
        if(b>a){
            mayor = true;
        }else{
            mayor = false;
        }
        if(mayor == true){
            System.out.println("Mayor.");
        }else{
        }
    }
}