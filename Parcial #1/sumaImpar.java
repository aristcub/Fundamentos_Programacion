import java.util.Scanner;
public class sumaImpar{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cont = 0;
        while(n != 0){
            if((n % 2 )!=0){
                cont = cont + n;
            }
            n = scan.nextInt();
        }
        System.out.println(cont);
    }
}
