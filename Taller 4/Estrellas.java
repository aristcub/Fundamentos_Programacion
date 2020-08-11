import java.util.Scanner;
public class Estrellas{
    public static void main(String [] Args){
        int cont = 0;
        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0; 
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int inv = 0;
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();
        while(star >= 0){
            switch(star){
                case 0:
                cont0 ++;
                cont ++;
                break;
                
                case 1:
                cont1 ++;
                cont ++;
                break;
                
                case 2:
                cont2 ++;
                cont ++;
                break;
                
                case 3:
                cont3 ++;
                cont ++;
                break;
                
                
                case 4:
                cont4 ++;
                cont ++;
                break;
                
                case 5:
                cont5 ++;
                cont ++;
                break;
                
                default:
                cont++;
                inv ++;
                break;
            }
            star = scan.nextInt();
        }
        System.out.println("0("+cont0+") *("+cont1+") **("+cont2+") ***("+cont3+") ****("+cont4+") *****("+cont +")");
        System.out.println("Total: "+cont+" Invalidas: "+inv);
    }
}