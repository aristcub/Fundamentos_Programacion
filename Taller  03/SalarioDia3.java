import java.util.*;
public class SalarioDia3{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el codigo del dia de la semana: ");
        int dia = read.nextInt();
        System.out.println("Ingrese el salario: ");   
        double salario = read.nextDouble();
        int error = 0;
        switch(dia){
            case 1:
            salario *= 1.455;
            break;
            case 2:
            case 3:
            //Ignorar
            break;
            case 4:
            salario *= 1.10;
            break;
            case 5:
            salario *= 1.295;
            break;
            case 6:
            salario *= 1.559;
            break;
            case 7:
            salario *= 1.75;
            break;
            default:
            error = 1;
        }
        switch(error){
            case 0:
            System.out.println("Salario: " + salario);
            break;
            case 1:
            System.out.println("Error codigo dia equivocado");
            break;
            default:
            break;
        }
    }
}