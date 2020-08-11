import java.util.Scanner;
public class principalString{
    public static void main(String [] Args){
        //String message = "Welcome to Java";
        //System.out.println("The length of " + message +" is " 
        //+ message.length() );
        
        //System.out.println(message.charAt(15));
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int j = s.length();
        int cont = 0;
        for(int i = 0; i < j; i ++){
            if(s.charAt(i) == 'a'){
                cont ++;
            }
        }
        System.out.println(cont);
    }
}