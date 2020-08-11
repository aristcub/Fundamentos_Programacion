import java.util.Scanner;
public class Substring{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese dos cadenas");
        String p1 = scan.next();
        String p2 = scan.next();
        int i = p2.length();
        String subP1 = p1.substring(0,2);
        String subP2 = p2.substring(i-2,i);
        String inv = "";
        for (int x=subP2.length()-1; x>=0; x--){
            inv = inv + subP2.charAt(x);
        }
        if(inv.equals(subP1)){
            System.out.println(subP1 + " coincide con " + inv);
        }
    }
}