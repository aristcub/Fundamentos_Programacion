import java.util.*;
public class SalarioDia2{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el codigo del dia de la semana: ");
        int dia = read.nextInt();
        System.out.println("Ingrese el salario: ");   
        double salario = read.nextDouble();
        boolean error = false;
        if(dia == 1){
            salario *= 1.455;
        }else if(dia == 2 && dia == 3){
            //Ignorar
        }else if(dia == 4){
            salario *= 1.10;
        }else if(dia == 5){
            salario *= 1.295;
        }else if(dia == 6){
            salario *= 1.559;
        }else if(dia == 7){
            salario *= 1.75;
        }else{
            error = true;
        }
        if(error == false){
            System.out.println("Salario: " + salario);
        }else{
            System.out.println("Error codigo dia equivocado");
        }
    }
}