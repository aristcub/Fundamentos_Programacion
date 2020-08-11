import java.util.Scanner;
public class ContarDigitos{
    public static void main(String [] Args){
        int i; 
        int j;
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        do{
            j = i%10;
            i = i/10;
            cont ++;
            System.out.println(j);
            
        }while(i > 0);
        System.out.println("Num digitos: "+cont);

        
    }
}