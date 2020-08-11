import java.util.*;
public class Suspencion2{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la nota:");
        int nota = read.nextInt();
        if((nota>=60)&&(nota<=80)){
            System.out.println("Suspendido.");
        }
    }
}