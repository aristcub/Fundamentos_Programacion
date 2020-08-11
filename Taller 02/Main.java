  public class Main{
    public static void main(String[] args){
        //Contador
        
        /**Contador cuenta1 = new Contador();
        cuenta1.incr();
        System.out.println ( cuenta1.obtCont() );**/
        
        //ContIncr
        
        /**ContIncr cont1 , cont2 ; 
        cont1 = new ContIncr () ;
        cont2 = new ContIncr () ;
        cont1.incr();
        cont2.incr();
        cont1.incr();
        System.out.printf("%3d %3d\n", cont1.obtCont(), cont2.obtCont());
        System.out.printf("%03d %03d\n", cont1.obtCont(), cont2.obtCont());
        cont2.reiniciar();
        cont1.incr();
        cont2.incr(); 
        cont1.incr();
        System.out.printf("%3d %3d\n", cont1.obtCont(), cont2.obtCont());
        System.out.printf("%03d %03d\n", cont1.obtCont(), cont2.obtCont ());**/
        
        //ContIncr2
        /**ContIncr2 cuenta1 = new ContIncr2();
        cuenta1.incr();
        cuenta1.reiniciar();
        cuenta1.incr();
        cuenta1.reiniciar();
        cuenta1.incr();        
        cuenta1.reiniciar();
        cuenta1.incr();
        
        System.out.println ( cuenta1.obtCont() );
        System.out.println ( cuenta1.prueba() ); //esta funcion fue para probar 
        //el conteo del init**/
        
        //Problema 10
        
        /**Contador Contador = new Contador();
        Contador.incr();
        Contador.incr();
        Contador.incr();
        Contador.incr();
        Contador.incr();
        System.out.printf("Contador: %03d\n", Contador.obtCont() );
        Contador.reiniciar();
        Contador.incr();
        Contador.incr();
        Contador.incr();
        System.out.printf("Contador: %03d\n", Contador.obtCont() );
        Contador.reiniciar();
        System.out.printf("Contador: %03d\n", Contador.obtCont() );**/
        //Problema 11
        
        Contador cont1 , cont2;
        cont1 = new Contador();
        cont2 = new Contador();
        cont1.incr();
        cont1.incr();
        cont1.incr();
        cont2.incr();
        cont2.incr();
        System.out.printf("cont1:%2d cont2: %02d\n", cont1.obtCont() , cont2.obtCont());
        cont1.reiniciar();
        cont1.incr();
        cont1.incr();
        cont1.incr();
        cont2.incr();
        cont2.incr();
        System.out.printf("cont1:%2d cont2: %02d\n", cont1.obtCont() , cont2.obtCont());
        cont1.incr();
        cont2.reiniciar();
        cont2.incr();
        cont2.incr();
        System.out.printf("cont1:%2d cont2: %02d\n", cont1.obtCont() , cont2.obtCont());
        
    }
}