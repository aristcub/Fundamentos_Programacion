public class Parcial3{
    public Parcial3(){
        System.out.println("Hola desde p3");
    }
    public static void main(){
        Parcial2 p2 = new Parcial2();
    }
}
class Parcial2 extends Parcial3{
    public Parcial2(){
        this("Hola this");
        System.out.println("Hola desde P2");
    }
    public Parcial2(String m){
        System.out.println(m);
    }
}