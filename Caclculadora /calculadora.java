import java.util.*;
public class calculadora{
    public static void main(String [] Args){
        mostrarMenu();
    }
    
    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("\n|******************************* MENÚ ******************************|\n"+
                               "|*************************¿Qué deseas hacer?************************|\n"+
                               " Ingrese el numero de la opción a realizar:\n"+
                               "   1) Sumar.\n"+
                               "   2) Restar.\n"+
                               "   3) Dividir.\n"+
                               "   4) Multiplicar\n"+
                               "   5) Raiz cuadrada.\n"+
                               "   6) Potencia.\n"+
                               "   0) Salir del programa.\n"+
                               "|********************************************************************|\n");
            int ans = scan.nextInt();
            switch(ans){ 
                case 1:
                    System.out.println("Ingrese dos valores para sumar: ");
                    double as = scan.nextDouble();
                    double bs = scan.nextDouble();
                    System.out.println("Su resultado es:"+sumar(as,bs));
                break;
                case 2:
                    System.out.println("Ingrese dos valores para restar: ");
                    double ar = scan.nextDouble();
                    double br = scan.nextDouble();
                    System.out.println("Su resultado es:"+restar(ar,br));
                break;
                case 3:
                    System.out.println("Ingrese dos valores para multiplicar: ");
                    double am = scan.nextDouble();
                    double bm = scan.nextDouble();
                    System.out.println("Su resultado es:"+multiplicar(am,bm));
                break;
                case 4:
                    System.out.println("Ingrese dos valores para dividir: ");
                    double ad = scan.nextDouble();
                    double bd = scan.nextDouble();
                    System.out.println("Su resultado es:"+dividir(ad,bd));
                break;
                case 5:
                    System.out.println("Ingrese un valores para calcularle la raiz cuadrada: ");
                    double asr = scan.nextDouble();
                    System.out.println("Su resultado es:"+raiz(asr));
                break;
                case 6:
                   System.out.println("Ingrese la base de la potenciacion seguida de su exponente: ");
                    double bp = scan.nextDouble();
                    double ep = scan.nextDouble();
                    System.out.println("Su resultado es:"+potencia(bp,ep));
                break;
    
                case 0:
                    System.out.println("\n|**************** Gracias por usar nuestro programa *****************|\n"+
                                       " Hecho por:\n"+
                                       " -Dixon Andres Calderon Ortega");
                    flag = false;   
                break;
                default:
                    System.out.print("Por favor ingresa una opcion valida.");
                break;
            }
        }
    }
    
    static public double sumar(double a, double b){
        double ans = a + b;
        return ans;
    }
    
    static public double restar(double a, double b){
        double ans = a - b;
        return ans;
    }
    
    static public double dividir(double a, double b){
        double ans = a / b;
        return ans;
    }
    
    static public double multiplicar(double a, double b){
        double ans = a * b;
        return ans;
    }
    
    static public double raiz(double a){
        double ans = Math.sqrt(a);
        return ans;
    }
    
    static public double potencia(double b, double e){
        double ans = Math.pow(b,e);
        return ans;
    }
}
