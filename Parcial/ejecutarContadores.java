import java.util.Scanner;
public class ejecutarContadores{
    public static void main(String [] Args){
        contadorParImpar cont = new contadorParImpar();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int i = scan.nextInt();
            cont.contar(i);
        }
        System.out.println("cont par:"+ cont.obtPar());
        System.out.println("cont impar:"+ cont.obtImpar());
    }
}