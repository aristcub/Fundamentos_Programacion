import java.util.*;
public class ImparPar{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor:");
        int a = read.nextInt();
        if(a%2 == 0){
            System.out.println("Par.");
        }else{
            System.out.println("Inpar.");
        }
    }
}