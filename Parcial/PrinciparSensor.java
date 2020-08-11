import java.util.Scanner;
public class PrinciparSensor{
    public static void main(String [] Args){
      Scanner scan = new Scanner(System.in);
      SensorLuz sl1 = new SensorLuz(18,40);
      System.out.println("Ingrese la operacion:");
      String key = scan.next();
      boolean sentinel = true;
      do{
          switch(key){
              case "duplicar":
              System.out.println("La intensidad actual es de: "+ sl1.getIntensidad());
              sl1.duplicarIntensidad();
              System.out.println("La nueva intensidad es de: "+ sl1.getIntensidad());
              System.out.println("Ingrese la operacion:");
              key = scan.next();
              break;
              
              case "asignarint":
              System.out.println("Ingrese i:");
              int j = scan.nextInt();
              sl1.setIntensidad(j);
              System.out.println("Ingrese la operacion:");
              key = scan.next();
              break;
              
              case"salir":
              key = "salir";
              break;
              
              default:
              System.out.println("Ingrese la operacion:");
              key = scan.next();
              break;
          }
      }while(!key.equals("salir"));
    }
}