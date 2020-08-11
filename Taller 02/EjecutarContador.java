public class EjecutarContador{
    public static void main(String[] args){
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