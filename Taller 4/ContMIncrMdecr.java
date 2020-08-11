import java.util.Scanner;
public class ContMIncrMdecr{
    public static void main(String [] Args){
        int cont = 0;
        double j = 0;
        Scanner scan = new Scanner(System.in);
        double i = scan.nextDouble();
        while(i != 0){
            if(i>=j){
                cont ++;
                System.out.println("+1");
            }else{
                cont --;
                System.out.println("-1");
            }
            j = i;
            i = scan.nextDouble();
        }
        System.out.println(cont);
    }
}