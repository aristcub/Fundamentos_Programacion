import java.util.*;
public class Principal{
    public static void main(String[] args){        
        //If/then
        /**Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temp = read.nextInt();
        if(temp > 27){
            System.out.println("Comprar helado (Cerveza).");
            System.out.println("Comprar mas cerveza.");
        }
        System.out.println("Fin programa.");**/       
        //If/then/else
        /**Scanner read = new Scanner(System.in);
        System.out.println("Ingrese los creditos aprobados: ");
        int credAprobados = read.nextInt();
        if(credAprobados >= 120){
            System.out.println("Graduado.");
        }else{
            System.out.println("No se gradua.");
        }
        System.out.println("Fin programa.");**/
        
        //Problema circulo.
        /**Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double r = read.nextDouble();
        Circulo circulo1 = new Circulo();
        if(r>0){
          circulo1.setRadio(r); 
          System.out.println("Radio de c1: "+ circulo1.getRadio()); 
        }else{
          System.out.println("Error. ¿De que me hablas, viejo?");**/
          
        //If anidados
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temp = read.nextInt();

        if(temp > 27){
            System.out.println("Hay que verificar que tienes suficiente dinero.");
            System.out.println("La cerveza cuesta 5.");
            System.out.println("Ingrese el dinero: ");
            int dine = read.nextInt();
                if(dine>5){
                    System.out.println("Puedes comprar cerveza.");
                    int cont = 0;
                        while(dine>=5){                            
                            cont ++;
                            dine -= 5;
                        }
                        
                    System.out.println("Compraste" + cont);
                  }else{
                    System.out.println("No tienes suficiente dinero.");
            }
        }else{
            System.out.println("No esta haciendo calor.");
        }
        
        System.out.println("Fin programa.");
        
        /**Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temp = read.nextInt(); 
        System.out.println("Ingrese el dinero: ");
        int dine = read.nextInt();
        if((temp>27)&&(dine>5)){
            System.out.println("Comprar cerveza");
        }
        System.out.println("fin del programa.");**/
   }
}

