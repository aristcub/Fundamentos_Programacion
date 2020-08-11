import java.util.Scanner;
public class mainb{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String name = scan.next();
        String key = "xxx";
        int cont = 0;
        while(name.indexOf(key)!= -1){
            name = name.substring(0,name.indexOf(key))
            + name.substring((name.indexOf(key)+1),name.length());
            cont ++;
        }
        System.out.println(cont);
    }
} 