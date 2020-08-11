import java.util.Scanner;
public class Input_2{
    public static void main(String[] args) {
        final int desp = 5;
        int valor;
        Scanner scan = new Scanner(System.in);
        valor = scan.nextInt();
        valor = valor + desp;
        System.out.println("Computo  :" + valor);
}
}