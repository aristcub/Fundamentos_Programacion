import java.util.*;
public class Principal2{
    public static void main(String [] args){
      Scanner read = new Scanner(System.in);
      System.out.println("Ingrese la nota: ");  
      int nota = read.nextInt();
      if((nota>10)||(nota<1)){
          System.out.println("ERROR.");
        }else{
            
          switch(nota){
           case 10:
            System.out.println("Alto teso");
            break;
           case 9:
            System.out.println("Teso");
            break;
           case 8:
            System.out.println("Tesito");
            break;
           case 7:
            System.out.println("Vas bien");
            break;
           default:
            System.out.println("Puedes mejorar");
           break;
           }
      }   
    }
}